package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Conjunction extends Node {
	Predicate left;
	Predicate right;
	public Conjunction(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

}
