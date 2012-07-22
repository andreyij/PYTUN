package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class RealValue extends Value {
	private double value;

	public RealValue(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println(value);
	}

}
