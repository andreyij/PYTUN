package org.pytun.storage.value;

public class DbString extends DbValue {

	public DbString(String v) {
		setValue (v);
	}
	
	public String getValue() {
		return s;
	}
	
	public void setValue(String v) {
		s = v;
	}

	@Override
	public String getType() {
		return "STRING";
	}

	@Override
	public String toString() {
		return s;
	}
	
}
