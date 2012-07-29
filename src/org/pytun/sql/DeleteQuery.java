package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;

public class DeleteQuery extends Query {

	private Node from;
	private Node where;

	public DeleteQuery(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Node getFrom() {
		return from;
	}

	public void setFrom(Node from) {
		this.from = from;
	}

	public Node getWhere() {
		return where;
	}

	public void setWhere(Node where) {
		this.where = where;
	}

	@Override
	protected List<Identifier> getTableContext() throws Exception {
		List<Identifier> l = new ArrayList<Identifier>();
		l.add((Identifier) from);
		return l;
	}

	@Override
	protected void setupAST() {
		from.setParent(this);
		from.setStatement(this);
		from.setupAST();

		if (where != null) {
			where.setParent(this);
			where.setStatement(this);
			where.setupAST();
		}
		super.setupAST();
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("DELETE");

		printTabs(indent + 1);
		System.out.println("TABLE");
		from.print(indent + 2);

		if (where != null) {
			printTabs(indent + 1);
			System.out.println("WHERE");
			where.print(indent + 2);
		}
	}

	@Override
	public Node accept(Visitor v) throws Exception {
		from = from.accept(v);
		if (where != null) {
			where = where.accept(v);
		}
		return v.Visit(this);
	}

}
