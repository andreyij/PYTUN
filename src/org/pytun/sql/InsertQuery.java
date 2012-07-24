package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;

public class InsertQuery extends Query {

	private List<Node> columns;
	private List<Node> values;
	private Identifier into;

	public InsertQuery(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setupAST() {
		for (Node n : columns) {
			n.setParent(this);
			n.setStatement(this);
			n.setupAST();
		}
		for (Node n : values) {
			n.setParent(this);
			n.setStatement(this);
			n.setupAST();
		}
		into.setParent(this);
		into.setStatement(this);
		into.setupAST();
	}

	@Override
	protected List<Identifier> getTableContext() throws Exception {
		List<Identifier> l = new ArrayList<Identifier>();
		l.add(into);
		return l;
	}

	public Node accept(Visitor v) throws Exception {
		if (columns != null) {
			int len = columns.size();
			for (int i = 0; i < len; i++) {
				columns.set(i, columns.get(i).accept(v));
			}
		}
		for (int i = 0; i < values.size(); i++) {
			values.set(i, values.get(i).accept(v));
		}

		return v.Visit(this);
	}

	public List<Node> getColumns() {
		return columns;
	}

	public void setColumns(List<Node> columns) {
		this.columns = columns;
	}

	public List<Node> getValues() {
		return values;
	}

	public void setValues(List<Node> values) {
		this.values = values;
	}

	public Identifier getInto() {
		return into;
	}

	public void setInto(Identifier into) {
		this.into = into;
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("INSERT");

		printTabs(indent + 1);
		System.out.println("TABLE");
		into.print(indent + 2);

		printTabs(indent + 1);
		System.out.println("COLUMNS");
		for (Node n : columns) {
			n.print(indent + 2);
		}

		printTabs(indent + 1);
		System.out.println("VALUES");
		for (Node n : values) {
			n.print(indent + 2);
		}
	}

}
