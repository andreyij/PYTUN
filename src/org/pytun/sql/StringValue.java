package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class StringValue extends Value {
	private String value;
	
	public StringValue(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
