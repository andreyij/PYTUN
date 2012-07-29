package org.pytun.storage.value;

public class DbBoolean extends DbValue {
	
	public DbBoolean(boolean v) {
		setValue (v);
	}
	
	public boolean getValue() {
		return b;
	}
	
	public void setValue(boolean v) {
		b = v;
	}

	@Override
	public String getType() {
		return "BOOLEAN";
	}
}
