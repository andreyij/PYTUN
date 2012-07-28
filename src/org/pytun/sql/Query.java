package org.pytun.sql;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

public class Query extends Node {
	protected QueryContext context;

	public Query(CommonTree t) {
		super(t);
	}

	public void resolveIdentifier(Identifier i) throws Exception {
		context.resovleIdentifier(i);
	}

	public void initContext() throws Exception {
		context = new QueryContext();
		context.buildContext(getTableContext());
	}

	protected List<Identifier> getTableContext() throws Exception {
		/* never call this method from this class */
		throw new UnsupportedOperationException();
	}

	@Override
	protected void resolveNames() throws Exception {
		initContext();
		super.resolveNames();
	}

}
