package org.pytun.storage.value;

public class DbDouble extends DbValue {

	public DbDouble(double v) {
		setValue(v);
	}
	
	public double getValue() {
		return d;
	}
	
	public void setValue(double v) {
		d = v;
	}

	@Override
	public String getType() {
		return "DOUBLE";
	}

	@Override
	public String toString() {
		return Double.toString(d);
	}
	
}
