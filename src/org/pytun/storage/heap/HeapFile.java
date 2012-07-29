package org.pytun.storage.heap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.pytun.storage.common.Page;
import org.pytun.storage.common.PageInfo;
import org.pytun.storage.common.Record;
import org.pytun.storage.common.RecordID;
import org.pytun.storage.io.BufferManager;
import org.pytun.storage.io.DiskManager;
import org.pytun.storage.io.FileAccess;

public class HeapFile 
{

	private LinkedList<PageInfo> 		freePages;
	private LinkedList<PageInfo> 		fullPages;
	private FileAccess 					fileAccess;
	private BufferManager 				buffMgr;
	private DiskManager 				diskMgr;
	private int 						fileID;
	
	public HeapFile (int fileID, FileAccess fileAccess, BufferManager buffMgr, DiskManager diskMgr)
	{
		this.fileID = fileID;
		this.fileAccess = fileAccess;
		this.buffMgr = buffMgr;
		
		freePages = new LinkedList<PageInfo>();
		fullPages = new LinkedList<PageInfo>();
	}
	
	/* TODO: create file */ 
	public void createFile ()
	{
		
	}
	
	/* TODO : destroy file */
	public void destroyFile ()
	{
		
	}
	
	public void loadHeapFileInfo () throws Exception
	{
		/* TODO: should share the information with Disk Manager? */
		
		ArrayList<PageInfo> pagesInfo = fileAccess.getAllPagesInfo(fileID);
		for (int i = 0; i < pagesInfo.size(); i++)
		{
			PageInfo pgInfo = pagesInfo.get(i);
			
			if (pgInfo.freeSpace == 0)
			{
				fullPages.add(pgInfo);
			}
			else
			{
				freePages.add(pgInfo);
			}
		}
	}
	
	public void insertRecord (Record rec) throws Exception
	{
		if (freePages.size() == 0)
		{
			/* TODO: new page must be created */
		}
		else
		{
			PageInfo pInfo = freePages.get(0);
			/* since records are fixed-size, the first free page will
			 * surely have enough free space for the newly inserted record
			 */
			int pageID = pInfo.pageID;
			
			/* get page from buffer manager */
			Page page = buffMgr.getPage(pageID);
			page.insertRecord(rec);
			
			/* write on disk */
			buffMgr.flushPage(page);
			
			/* update PageInfo */
			pInfo.updateFreeSpace(true);
			/* TODO: should inform (if info is not shared) the DiskManager */
			
			if (pInfo.freeSpace == 0)
			{
				fullPages.add(pInfo);
				freePages.remove(0);
			}
		}
	}
	
	public void deleteRecord (RecordID rid) throws Exception
	{
		int pageID = rid.pageID;
		PageInfo pInfo = null;
		
		/* get page from buffer manager */
		Page page = buffMgr.getPage(pageID);
		page.deleteRecord(rid.slotID);
		
		/* write on disk */
		buffMgr.flushPage(page);
		
		
		/* find PageInfo, since we must update PageInfo */
		/* TODO: consider better searching methods */
		Iterator<PageInfo> it = freePages.iterator();
		while (it.hasNext())
		{
			PageInfo elem = it.next();
			if (elem.pageID == pageID)
			{
				pInfo = elem;
				break;
			}
		}
		
		if (pInfo == null)
		{
			it = fullPages.iterator();
			while (it.hasNext())
			{
				PageInfo elem = it.next();
				if (elem.pageID == pageID)
				{
					pInfo = elem;
					break;
				}
			}
		}
		
		if (pInfo == null)
		{
			System.err.println ("Page not found");
			return;
		}
		
		/* update PageInfo */
		pInfo.updateFreeSpace(false);
		/* TODO: should inform (if info is not shared) the DiskManager */
		
		/*if (page.getFreeSpace() > 0)
		{
			freePages.add(pInfo);
			fullPages.remove(index);
		}*/
		
	}
	
	public Record getRecord (RecordID rid) throws Exception
	{
		int pageID = rid.pageID;
		
		Page page = buffMgr.getPage(pageID);
		
		return page.readRecordAt(rid.slotID);
	}
}
