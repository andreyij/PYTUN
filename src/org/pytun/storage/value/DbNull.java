package org.pytun.storage.value;

public class DbNull extends DbValue {
	
	public DbNull () {
	}

	@Override
	public String getType() {
		return "DBNULL";
	}

	@Override
	public String toString() {
		return "NULL";
	}
	
}
