package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Predicate extends Condition {
	private BooleanOperator op;

	public Predicate(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public BooleanOperator getOperator() {
		return op;
	}

	public void setOperator(BooleanOperator op) {
		this.op = op;
	}
}
