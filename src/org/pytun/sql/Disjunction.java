package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Disjunction extends Predicate {
	Predicate left;
	Predicate right;
	public Disjunction(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

}
