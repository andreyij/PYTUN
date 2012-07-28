package org.pytun.sql;

import java.sql.Date;

import org.antlr.runtime.tree.CommonTree;

public class DateTimeValue extends Value {
	private Date value;

	public DateTimeValue(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Date getValue() {
		return value;
	}

	public void setValue(Date value) {
		this.value = value;
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println(value);
	}

}
