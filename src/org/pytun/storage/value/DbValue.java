package org.pytun.storage.value;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public abstract class DbValue {
	protected int i;
	protected double d;
	protected String s;
	protected boolean b;
	protected Date da;
	protected Time ti;
	protected Timestamp ts;
	
	public abstract String getType();
	public abstract String toString();
}
