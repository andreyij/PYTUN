package org.pytun.storage.common;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;

import org.pytun.util.ByteBuffer;

public class Record {
	
	
	public static final int RC_FIXED_SIZE = 3 * /* pageid, slot id, nFields => 3 integers*/
											4 ; 

	private RecordID 			rid; /* record id - page id, slot number */
	private int					nFields; /* number of fields */
	private Vector<Integer> 	fieldOffsets; /*integer array holding the offsets at which each field is located */
	private byte[] 				recordData; /* buffer containing the record data */
	
	
	public Record (DataInputStream buffer, int size) throws Exception {
		
		Vector<Integer> fieldOffsets = new Vector<Integer>();
		
		int pageID = buffer.readInt();
		int slotID = buffer.readInt();
		
		rid = new RecordID(pageID, slotID);
		
		nFields = buffer.readInt();
		for (int i = 0; i < nFields; i++)
		{
			fieldOffsets.add(buffer.readInt());
		}
		fieldOffsets.add(size); // the ending of the last field
		
		recordData = new byte[size - (RC_FIXED_SIZE + nFields * 4)];
		buffer.read(recordData);
	}
	
	public Record (int pageID, int slotID)
	{
		this.rid = new RecordID (pageID, slotID);
		this.nFields = -1;
		this.fieldOffsets = null;
		recordData = null;
	}
	
	
	public void setSlotID (int slotID)
	{
		rid.slotID = slotID;
	}
	
	public RecordID getRID () {
		return rid;
	}
	
	public int getNrFields () {
		return nFields;
	}
	
	public int getRecordSize () {
		return recordData.length;
	}
	
	public int getSizeOfFieldAt (int i) {
		if (i >= nFields) {
			System.err.println("Invalid field index");
			System.exit(-1);
		}
		return fieldOffsets.elementAt(i + 1) - fieldOffsets.elementAt(i);
	}
	
	public byte[] readFieldAt (int i) {
		if (i >= nFields) {
			System.err.println("Invalid field index");
			System.exit(-1);
		}
		
		byte[] fieldData = new byte[fieldOffsets.elementAt(i + 1) - fieldOffsets.elementAt(i)];
		
		int k = 0;
		for (int j = fieldOffsets.elementAt(i)  ; j < fieldOffsets.elementAt(i + 1); j++)
		{
			fieldData[k] = recordData[j];
			k++;
		}
		
		return fieldData;
	}
	
	
	public void updateFieldAt (int fieldIndex, byte[] b) {
		if (fieldIndex >= nFields) {
			System.err.println ("Invalid field index");
			System.exit(-1);
		}
		
		int size = recordData.length;
		byte[] newRecordData = new byte[size + b.length - getSizeOfFieldAt(fieldIndex)];
		Vector<Integer> newFieldOffsets = new Vector<Integer> ();
		for (int j = 0; j < fieldIndex; j++)
		{
			ByteBuffer.copy (readFieldAt(j), newRecordData, fieldOffsets.elementAt(j));
			newFieldOffsets.add (fieldOffsets.elementAt(j));
		}
		
		ByteBuffer.copy (b, newRecordData, fieldOffsets.elementAt(fieldIndex));
		newFieldOffsets.add (fieldOffsets.elementAt(fieldIndex));
		
		for (int j = fieldIndex + 1; j < nFields; j++) {
			ByteBuffer.copy (readFieldAt(j), newRecordData, fieldOffsets.elementAt(j - 1) + getSizeOfFieldAt(j));
			newFieldOffsets.add(fieldOffsets.elementAt(j - 1) + getSizeOfFieldAt(j));
		}
		
		recordData = newRecordData;
		fieldOffsets = newFieldOffsets;
	}
	
	
	public void insertField ()
	{
		/* a null value should be placed here, since the insertion
		 * of a new field is the result of schema change 
		 */
		
		nFields++;
		fieldOffsets.add(fieldOffsets.elementAt(nFields - 1)); // null value is of size 0
	}
	
	public void writeToBuffer (byte[] dst, int offset)
	{
		int off = offset;
		
		ByteBuffer.copy (ByteBuffer.intToByteArray(rid.pageID), dst, off);
		off += Constants.STORAGE_INT_SIZE;
		
		ByteBuffer.copy (ByteBuffer.intToByteArray(rid.slotID), dst, off);
		off += Constants.STORAGE_INT_SIZE;
		
		ByteBuffer.copy (ByteBuffer.intToByteArray(rid.pageID), dst, off);
		off += Constants.STORAGE_INT_SIZE;
		
		for (int i = 0; i < nFields; i++)
		{
			ByteBuffer.copy (ByteBuffer.intToByteArray(fieldOffsets.elementAt(i)), dst, Constants.STORAGE_INT_SIZE);
			off += Constants.STORAGE_INT_SIZE;
		}
		
		ByteBuffer.copy (recordData, dst, recordData.length);
		off += recordData.length;
	}
	
	public static Record readFromBuffer (byte[] buffer, int offset, int size) throws Exception
	{
		ByteArrayInputStream byteStream = new ByteArrayInputStream(buffer, offset, size);
		DataInputStream din = new DataInputStream(byteStream);
		
		return new Record (din, size);
	}
}
