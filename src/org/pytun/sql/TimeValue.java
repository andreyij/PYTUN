package org.pytun.sql;

import java.sql.Date;

import org.antlr.runtime.tree.CommonTree;

public class TimeValue extends Value {
	private Date value;

	public TimeValue(CommonTree t) {
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
