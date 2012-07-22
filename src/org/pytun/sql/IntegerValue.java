package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class IntegerValue extends Value {

	private int value;

	public IntegerValue(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println(value);
	}

}
