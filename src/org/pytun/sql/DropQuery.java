package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

public class DropQuery extends Query {

	private Identifier table;

	public DropQuery(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Identifier getTable() {
		return table;
	}

	public void setTable(Identifier table) {
		this.table = table;
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("DROP TABLE");
		table.print(indent + 1);
	}

	@Override
	protected List<Identifier> getTableContext() throws Exception {
		List<Identifier> l = new ArrayList<Identifier>();
		l.add(table);
		return l;
	}

}
