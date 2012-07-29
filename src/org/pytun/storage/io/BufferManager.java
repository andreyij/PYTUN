package org.pytun.storage.io;

import org.pytun.storage.common.Page;

public class BufferManager 
{
	private PagePool pool;
	private FileAccess fileAccess;
	private DiskManager diskManager;
	
	public BufferManager ()
	{
		pool = new PagePool();
		diskManager = new DiskManager();
		fileAccess = new FileAccess(diskManager);
	}
	
	public void flushPage (Page page)
	{
		fileAccess.writePage(page);
		page.setNotDirty();
	}
	
	public void deletePage (int pageID)
	{
		
	}
	public Page getPage (int pageID) throws Exception
	{
		Page p = pool.getPage(pageID);
		
		if (p != null)
		{
			return p;
		}
		
		/* page is not in memory */
		p = fileAccess.readPage(pageID);
		
		if (p == null)
		{
			return null;
		}
		
		if (pool.isFull() == false)
		{
			/* cache the page in memory */
			pool.add(p);
		}
		else
		{
			/* use Random replacement policy */
			/* TODO : maybe use another replacement policy? */
			Page replaced = pool.getRandomPage();
			if (replaced.isDirty())
			{
				flushPage(replaced);
			}
			pool.remove(replaced.pageID);
			
			pool.add(p);
		}
		
		return p;
	}
	
}
