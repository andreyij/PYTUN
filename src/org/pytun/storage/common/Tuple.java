package org.pytun.storage.common;

import java.util.ArrayList;

import org.pytun.storage.value.DbNull;
import org.pytun.storage.value.DbValue;

public class Tuple {

	private ArrayList<DbValue> values;

	public Tuple(int count) {
		values = new ArrayList<DbValue>();
		
		for (int i=0; i < count; i++) {
			values.add(new DbNull());
		}
	}

	public int getCount() {
		return values.size();
	}

	public void setValue(int idx, DbValue val) throws Exception {
		if (idx < 0 || idx >= values.size()) {
			throw new Exception("Tuple index out of bounds!");
		}
		
		values.set(idx, val);
	}
	
	public DbValue getValue(int idx) throws Exception {
		if (idx < 0 || idx >= values.size()) {
			throw new Exception("Tuple index out of bounds!");
		}
		
		return values.get(idx);
	}

}