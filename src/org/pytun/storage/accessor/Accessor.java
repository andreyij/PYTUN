package org.pytun.storage.accessor;

import org.pytun.storage.catalog.TupleDescriptor;
import org.pytun.storage.common.Tuple;
import org.pytun.storage.value.DbValue;

public abstract class Accessor {
	
	protected TupleDescriptor descriptor;
	protected Tuple tuple;
	
	// value level
	public abstract DbValue readValue(int idx);
	public abstract void writeValue(int idx, DbValue value);
	
	// cursor
	public abstract void open();
	public abstract void close();
	public abstract void next();
	
	// row level
	public abstract void update();
	public abstract void add();
	public abstract void delete();
}
