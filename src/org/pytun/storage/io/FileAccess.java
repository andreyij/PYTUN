package org.pytun.storage.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.pytun.storage.common.Constants;
import org.pytun.storage.common.Page;
import org.pytun.storage.common.PageInfo;

public class FileAccess 
{

	private DiskManager diskManager;
	
	public FileAccess (DiskManager dm)
	{
		diskManager = dm;
	}
	
	public PageInfo getPageInfo (int fileID, int offset) throws Exception
	{
		if (fileID >= DiskManager.DISK_MGR_MAX_NR_FILES)
		{
			System.err.println("Invalid file id " + fileID);
			return  null;
		}
			
		String file = diskManager.filePaths[fileID];
		if (file == null)
		{
			System.err.println ("Invalid file");
			return null;
		}
		
		if (offset % Constants.STORAGE_PAGE_SIZE != 0)
		{
			System.err.println ("Invalid offset");
			return null;
		}
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile(new File(file), "r");

			if (offset > raf.length())
			{
				System.err.println ("Invalid offset, beyond file size");
				return null;
			}
			
			byte[] buffer = new byte[PageInfo.PAGEINFO_SIZE];
			
			raf.seek(offset);
			raf.read(buffer);
			
			ByteArrayInputStream byteStream = new ByteArrayInputStream(buffer);
			DataInputStream din = new DataInputStream(byteStream);
			
			int pageID = din.readInt();
			int nrSlots = din.readInt();
			
			/* read slot information - of variable length, depending on the number of records */
			buffer = new byte[(nrSlots + 1) / 8];
			raf.read(buffer);
			
			byteStream = new ByteArrayInputStream(buffer);
			din = new DataInputStream(byteStream);
			
			PageInfo pInfo = new PageInfo(pageID);
			pInfo.readFromBuffer(din, nrSlots);
			
			return pInfo;	
		}
		catch (IOException e) {e.printStackTrace();}
		
		return null;
		
	}
	
	
	private int getFileID (int pageID)
	{
		return pageID & 0xFF000000; 
	}
	
	private int getPageOffset (int pageID)
	{
		return pageID &0x00FFFFFF;
	}
	
	protected void writePage (Page page)
	{
		int fileID = getFileID(page.pageID);
		
		if (fileID >= DiskManager.DISK_MGR_MAX_NR_FILES)
		{
			System.err.println("Invalid file id " + fileID);
			return ;
		}
			
		String file = diskManager.filePaths[fileID];
		if (file == null)
		{
			System.err.println ("Invalid pageID");
			return;
		}
		
		try 
		{
			RandomAccessFile raf = new RandomAccessFile(new File(file), "w");
			int pageIndex = diskManager.getPageOffset(fileID, getPageOffset(page.pageID));
			
			byte[] buffer = new byte[Constants.STORAGE_PAGE_SIZE];
			page.writeToBuffer(buffer);
			
			if (pageIndex * Constants.STORAGE_PAGE_SIZE > raf.length())
			{
				/* we need to append the page, as it is a new one */
				raf.seek(raf.length());
				raf.write(buffer);
			}
			else
			{
				raf.seek(Constants.STORAGE_PAGE_SIZE * pageIndex);
				raf.write(buffer);
			}
			
			raf.close();
			
		} catch (FileNotFoundException e) {e.printStackTrace();}
		  catch (IOException e) {e.printStackTrace();}
		
	}
	
	protected Page readPage (int pageID) throws Exception
	{
		int fileID = getFileID (pageID);
		
		if (fileID >= DiskManager.DISK_MGR_MAX_NR_FILES)
		{
			System.err.println("Invalid file id " + getFileID (fileID));
			return  null;
		}
			
		String file = diskManager.filePaths[fileID];
		if (file == null)
		{
			System.err.println ("Invalid pageID");
			return null;
		}
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile(new File(file), "r");
			int pageOffset = diskManager.getPageOffset(fileID, getPageOffset(pageID)); 

			if (pageOffset > raf.length())
			{
				System.err.println ("Invalid page offset");
				return null;
			}
			
			byte[] buffer = new byte[Constants.STORAGE_PAGE_SIZE];
			
			raf.seek(pageOffset);
			raf.read(buffer);
			
			return Page.readFromBuffer(buffer);
			
			
		} catch (FileNotFoundException e) {e.printStackTrace();}
		  catch (IOException e) {e.printStackTrace();}
		
		return null;
	}
}
