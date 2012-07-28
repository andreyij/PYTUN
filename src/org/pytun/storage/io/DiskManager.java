package org.pytun.storage.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public class DiskManager {

	public static final int DISK_MGR_MAX_NR_FILES = 256;
	public static final int FILE_DEFAULT_SIZE = 0;
	
	private Vector<Hashtable<Integer, Integer>> filePageOffsets;
	public String[] 	filePaths;
	private int 	 	firstFileID; /* first available file id */
	
	public DiskManager ()
	{
		filePageOffsets = new Vector<Hashtable<Integer, Integer>> ();
		for (int i = 0; i < DISK_MGR_MAX_NR_FILES; i++)
		{
			filePageOffsets.add(new Hashtable<Integer, Integer>());
		}
		
		String[] fp = updateListOfFiles();
		
		if (fp != null)
		{
			for (int i = 0; i < fp.length; i++)
			{
				this.filePaths[i] = fp[i];
			}
		}
		
		firstFileID = this.filePaths.length;
		for (int i = this.filePaths.length; i < DISK_MGR_MAX_NR_FILES; i++)
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
			
			if (firstFileID == DISK_MGR_MAX_NR_FILES)
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
			for (int i = firstFileID; i < DISK_MGR_MAX_NR_FILES; i++)
			{
				if (filePaths[i] == null)
				{
					firstFileID = i;
					return;
				}
			}
			firstFileID = DISK_MGR_MAX_NR_FILES;
		} 
		catch (IOException e) { e.printStackTrace(); }
	}
	
	protected void destroyFile (String path)
	{
		boolean found = false;
		for (int i = 0; i < DISK_MGR_MAX_NR_FILES; i++)
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
	
	public int getPageOffset (int fileID, int pageID)
	{
		if (fileID >= DISK_MGR_MAX_NR_FILES)
		{
			System.err.println ("Invalid fileID");
			return -1;
		}
		
		return filePageOffsets.elementAt(fileID).get(pageID);
	}
	
	public void createPage (int fileID)
	{
		
	}
}
