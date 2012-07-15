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
}