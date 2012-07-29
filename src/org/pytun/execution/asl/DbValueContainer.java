package org.pytun.execution.asl;

import org.pytun.storage.value.*;

public class DbValueContainer {

	private String name;
	private DbValue value;
	
	public DbValueContainer(String n) {
		name = n;
		value = new DbNull();
	}
	
	public DbValueContainer(String n, DbValue val) {
		name = n;
		setValue(val);
	}
	
	public DbValue getValue() {
		return value;
	}
	
	public void setValue(DbValue v) {
		value = v;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
}
