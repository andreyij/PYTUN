package org.pytun.sql;

import java.sql.Date;

import org.antlr.runtime.tree.CommonTree;

public class DateValue extends Value {
	private Date value;
	public DateValue(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	public Date getValue() {
		return value;
	}
	public void setValue(Date value) {
		this.value = value;
	}

}