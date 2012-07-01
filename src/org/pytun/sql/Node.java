package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Node {
	protected QueryContext context;
	protected CommonTree node;

	public Node(CommonTree t)
	{
		node = t;
	}

	public CommonTree getNode() {
		return node;
	}

	public void setNode(CommonTree node) {
		this.node = node;
	}

	public QueryContext getContext() {
		return context;
	}

	public void setContext(QueryContext context) {
		this.context = context;
	}
}
