package org.pytun.storage.io;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

import org.pytun.storage.common.Page;

public class PagePool {

	public static final int PAGEPOOL_MAX_NR_ELEMENTS = 1000;
	
	
	private Hashtable<Integer, Page> pool;
	
	public PagePool ()
	{
		pool = new Hashtable<Integer, Page> ();
	}
	
	public void add (Page p)
	{
		if (pool.get(p.pageID) != null)
		{
			System.err.println ("Invalid page pool");
			return;
		}
		
		pool.put(p.pageID, p);
	}
	
	public void remove (int pageID)
	{
		if (pool.remove(pageID) == null)
		{
			System.err.println ("Invalid page pool access");
		}
	}
	
	/* use this for the random replacement policy */
	public Page getRandomPage ()
	{
		Random r = new Random ();
		int index = r.nextInt(pool.size() - 1);
		Enumeration<Integer> elems = pool.keys();
		
		int i = 0;
		while (i < index)
		{
			elems.nextElement();
			i++;
		}
		return pool.get (elems.nextElement());
	}
	
	public Page getPage (int pageID)
	{
		return pool.get (pageID);
	}
	
	public boolean contains (int pageID)
	{
		return (pool.get(pageID) == null ? false : true);
	}
	
	public boolean isFull ()
	{
		return pool.size() == PAGEPOOL_MAX_NR_ELEMENTS;
	}
}
