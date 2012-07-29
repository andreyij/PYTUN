package org.pytun.storage.value;

public class DbInteger extends DbValue {
	
	public DbInteger(int v) {
		setValue(v);
	}
	
	public int getValue() {
		return i;
	}
	
	public void setValue(int v) {
		i = v;
	}

	@Override
	public String getType() {
		return "INTEGER";
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
}
