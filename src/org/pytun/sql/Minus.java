package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Minus extends ArithmeticExpression {

	public Minus(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Minus(CommonTree t, Node left, Node right) {
		super(t, left, right);
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("-");
		left.print(indent + 1);
		right.print(indent + 1);
	}

	public Value performOperation(IntegerValue l, IntegerValue r) {
		int result = l.getValue() - r.getValue();
		IntegerValue v = new IntegerValue(getNode());
		v.setValue(result);
		return v;
	}

	public Value performOperation(IntegerValue l, RealValue r) {
		double result = l.getValue() - r.getValue();
		RealValue v = new RealValue(getNode());
		v.setValue(result);
		return v;

	}

	public Value performOperation(RealValue l, IntegerValue r) {
		double result = l.getValue() - r.getValue();
		RealValue v = new RealValue(getNode());
		v.setValue(result);
		return v;
	}

	public Value performOperation(RealValue l, RealValue r) {
		double result = l.getValue() - r.getValue();
		RealValue v = new RealValue(getNode());
		v.setValue(result);
		return v;

	}
}
