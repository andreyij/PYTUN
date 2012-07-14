package org.pytun.util;

public class ByteBuffer {

	public static byte[] intToByteArray(int value) 
	{
		byte[] b = new byte[4];
		for (int i = 0; i < 4; i++) 
		{
			int offset = (b.length - 1 - i) * 8;
			b[i] = (byte) ((value >>> offset) & 0xFF);
		}
		return b;
	}
	
	public static void init (byte[] buff, int offset, int len)
	{
		for (int i = 0; i < len; i++)
		{
			buff[offset + i] = 0;
		}
	}
	public static void copy (byte[] src, byte[] dst, int offset) 
	{
		for (int i = 0; i < src.length; i++) 
		{
			dst[offset + i] = src[i];
		}
	}
}
