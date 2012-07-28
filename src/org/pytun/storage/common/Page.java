package org.pytun.storage.common;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;

import org.pytun.util.BitArray;
import org.pytun.util.ByteBuffer;

public class Page {
	
	public  int 				pageID;
	private int 				nrSlots;
	private BitArray			bitSet;
	private Vector<Record>		records;
	private boolean				isDirty;
	
	public Page (DataInputStream buffer) throws Exception
	{
		this.pageID = buffer.readInt();
		this.nrSlots = buffer.readInt();
		this.bitSet = BitArray.readFromBuffer (buffer, nrSlots);
		this.records = new Vector<Record>();
		
		byte[] pageData = new byte[Constants.STORAGE_PAGE_SIZE - (bitSet.getSize() +
							  	 Constants.STORAGE_INT_SIZE) + 
							  	 Constants.STORAGE_INT_SIZE];
		buffer.read(pageData);
		
		int recSize = pageData.length / nrSlots;
		for (int i = 0; i < nrSlots; i++)
		{
			if (bitSet.isBitSetAt(i))
			{
				this.records.add (Record.readFromBuffer(pageData, i * recSize, recSize));
			}
			else
			{
				this.records.add(new Record (pageID, i));
			}
		}
		
		isDirty = false;
	}
	
	public Record readRecordAt (int index) throws Exception
	{
		if (index >= nrSlots || bitSet.isBitSetAt(index) == false)
		{
			System.err.println ("Invalid record access!");
			return null;
		}
		return records.elementAt(index);
		
	}
	
	public int getHeaderSize ()
	{
		return Constants.STORAGE_INT_SIZE + /* page id */
			   Constants.STORAGE_INT_SIZE + /* nr slots */
			   bitSet.getSize(); /* bit set size */
	}
	
	public void deleteRecord (int slotID)
	{
		if (bitSet.isBitSetAt(slotID) == false)
		{
			System.err.println ("Delete failed: Slot is empty!");
			return;
		}
		
		bitSet.unsetBitAt(slotID);
		isDirty = true;
		
		Record deletedRec = records.elementAt(slotID);
		/* clear record information */
		deletedRec.clearInfo();
	}
	
	public void insertRecord (Record rec)
	{
		if (bitSet.getNoSetBits() == bitSet.getSize())
		{
			System.err.println ("Page already full! insertion should not have been attempted here!");
			return;
		}
		
		if (rec.getRID() != null)
		{
			for (int i = 0; i < nrSlots; i++)
			{
				if (bitSet.isBitSetAt(i) == false)
				{
					bitSet.setBitAt(i);
					isDirty = true;
					records.elementAt(i).copyRecordInfo(rec);
					break;
				}
			}
		}
		else
		{
			System.err.println ("Invalid new record! RecordID must not be already set!");
			return;
		}
	}
	
	public void writeRecordAt (Record rec, int index) throws Exception
	{
		if (index >= nrSlots)
		{
			System.err.println ("Invalid record access!");
			return;
		}
		
		this.records.set(index, rec);
		bitSet.setBitAt(index);
		isDirty = true;
	}
	
	public void writeToBuffer (byte[] buffer)
	{
		int off = 0;
		ByteBuffer.copy (ByteBuffer.intToByteArray(pageID), buffer, off);
		off += Constants.STORAGE_INT_SIZE;
		
		ByteBuffer.copy(ByteBuffer.intToByteArray(nrSlots), buffer, off);
		off += Constants.STORAGE_INT_SIZE;
		
		bitSet.writeToBuffer(buffer, off);
		off += bitSet.length();
		
		int recSize = (Constants.STORAGE_PAGE_SIZE - getHeaderSize()) / nrSlots;
		
		for (int i = 0; i < nrSlots; i++)
		{
			if (bitSet.isBitSetAt(i))
			{
				records.elementAt(i).writeToBuffer(buffer, off);
			}
			else
			{
				ByteBuffer.init(buffer, off, recSize);
			}
			off += recSize;
		}
		
	}
	
	public static Page readFromBuffer (byte[] buffer) throws Exception
	{
		ByteArrayInputStream byteStream = new ByteArrayInputStream(buffer);
		DataInputStream din = new DataInputStream(byteStream);
		
		return new Page (din);
	}
	
	public boolean isDirty ()
	{
		return isDirty;
	}
	
	public void setDirty ()
	{
		isDirty = true;
	}
	
	/* return the size in number of free slots */
	public int getFreeSpace ()
	{
		return bitSet.getSize() - bitSet.getNoSetBits();  
	}
}