package org.pytun.util;

import java.io.DataInputStream;

import org.pytun.storage.common.Constants;

public class BitArray {

	private int 		nBits;
	private byte[]		byteArray;
	
	public BitArray (int nBits)
	{
		this.nBits = nBits;
		byteArray = new byte[(nBits + 1) / 8];
		for (int i = 0; i < byteArray.length; i++)
		{
			byteArray[i] = 0;
		}
	}
	
	public int getSize ()
	{
		return Constants.STORAGE_INT_SIZE + byteArray.length;
	}
	
	public static BitArray readFromBuffer (DataInputStream buffer, int nBits) throws Exception
	{
		BitArray b = new BitArray(nBits);
		for (int i = 0; i < b.byteArray.length; i++)
		{
			b.byteArray[i] = buffer.readByte();
		}
		
		return b;
	}
	
	public void writeToBuffer (byte[] b, int offset)
	{
		ByteBuffer.copy(byteArray, b, offset);
	}
	
	public void setBitAt (int index)
	{
		int i = index / 8;
		int j = index % 8;
		byteArray[i] = (byte)(byteArray[i] | (1 << j));
	}
	
	public void unsetBitAt (int index)
	{
		int i = index / 8;
		int j = index % 8;
		byteArray[i] = (byte)(byteArray[i] & ~(1 << j));
	}
	
	public boolean isBitSetAt (int index)
	{
		int i = index / 8;
		int j = index % 8;
		
		return ((byte)(byteArray[i] & (1 << j)) == 0 ? false : true);
	}
	
	public int length ()
	{
		return nBits;
	}
}
