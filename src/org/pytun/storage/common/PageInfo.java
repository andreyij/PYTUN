package org.pytun.storage.common;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import org.pytun.util.BitArray;

public class PageInfo {
	
	public static final int PAGEINFO_SIZE = 2 * Constants.STORAGE_INT_SIZE;
	
	/* modify size when adding new fixed-size information!!! */
	
	public int pageID;
	public int freeSpace;
	
	
	public PageInfo (int pageID)
	{
		this.pageID = pageID;
	}
	
	
	public void readFromBuffer (DataInputStream din, int nrSlots) throws Exception
	{
		
		BitArray bitSet = BitArray.readFromBuffer (din, nrSlots);
		this.freeSpace = nrSlots - bitSet.getNoSetBits();
		
	}
}
