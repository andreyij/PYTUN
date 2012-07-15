package org.pytun.storage.io;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

import org.pytun.storage.common.Constants;
import org.pytun.storage.common.Page;

public class FileAccess 
{
	public static final int FILE_MAX_NR_FILES = 256;
	public static final int FILE_DEFAULT_SIZE = 0;
	
	private String[] 	filePaths;
	private int 	 	firstFileID; /* first available file id */
	
	/* load this list of file from some file at startup */
	public FileAccess ()
	{
		this.filePaths = new String[FILE_MAX_NR_FILES];
		firstFileID = 0;
		
		String[] fp = updateListOfFiles();
		
		if (fp != null)
		{
			for (int i = 0; i < fp.length; i++)
			{
				this.filePaths[i] = fp[i];
			}
		}
		
		firstFileID = this.filePaths.length;
		for (int i = this.filePaths.length; i < FILE_MAX_NR_FILES; i++)
		{
			this.filePaths[i] = null;
		}
	}
	
	/* TODO: load this list of file from some file at startup */
	
	private String[] updateListOfFiles ()
	{
		return null;
	}
	
	protected void createFile (String path)
	{
		try 
		{
			BufferedWriter out = new BufferedWriter(new FileWriter (path));
			
			if (FILE_DEFAULT_SIZE > 0)
			{
				char[] initBuffer = new char[FILE_DEFAULT_SIZE];
				
				for (int i = 0; i < FILE_DEFAULT_SIZE; i++)
				{
					initBuffer[i] = 0;
				}
				
				out.write(initBuffer);
			}
			out.close();
			
			if (firstFileID == FILE_MAX_NR_FILES)
			{
				System.err.println ("Max files exist");
				return;
			}
			
			if (filePaths[firstFileID] != null)
			{
				System.err.println ("Invalid first availabe file id");
				return;
			}
			
			filePaths[firstFileID] = path;
			for (int i = firstFileID; i < FILE_MAX_NR_FILES; i++)
			{
				if (filePaths[i] == null)
				{
					firstFileID = i;
					return;
				}
			}
			firstFileID = FILE_MAX_NR_FILES;
		} 
		catch (IOException e) { e.printStackTrace(); }
	}
	
	protected void destroyFile (String path)
	{
		boolean found = false;
		for (int i = 0; i < FILE_MAX_NR_FILES; i++)
		{
			if (filePaths[i].equals(path))
			{
				found = true;
				filePaths[i] = null;
				if (i < firstFileID)
				{
					firstFileID = i;
				}
			}
		}
		
		if (found == false)
		{
			System.err.println ("File not found");
			return;
		}
		
		File f = new File (path);
		if (f.delete() == false)
		{
			System.err.println ("Error deleting file " + path);
		}
		
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
		if (getFileID(page.pageID) >= FILE_MAX_NR_FILES)
		{
			System.err.println("Invalid file id " + getFileID (page.pageID));
			return ;
		}
			
		String file = filePaths[getFileID(page.pageID)];
		if (file == null)
		{
			System.err.println ("Invalid pageID");
			return;
		}
		
		try 
		{
			RandomAccessFile raf = new RandomAccessFile(new File(file), "w");
			int pageIndex = getPageOffset(page.pageID);
			
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

		if (getFileID(pageID) >= FILE_MAX_NR_FILES)
		{
			System.err.println("Invalid file id " + getFileID (pageID));
			return  null;
		}
			
		String file = filePaths[getFileID(pageID)];
		if (file == null)
		{
			System.err.println ("Invalid pageID");
			return null;
		}
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile(new File(file), "r");
			int pageIndex = getPageOffset(pageID);
			int pageOffset = pageIndex * Constants.STORAGE_PAGE_SIZE; 

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
