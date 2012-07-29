package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;

public class UpdateQuery extends Query {
	private List<Node> assignments;
	private Node table;
	private Node where;

	public UpdateQuery(CommonTree t) {
		super(t);
		assignments = new ArrayList<Node>();
		table = null;
		where = null;
		// TODO Auto-generated constructor stub
	}

	public List<Node> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Node> updateList) {
		this.assignments = updateList;
	}

	public Node getTable() {
		return table;
	}

	public void setTable(Node table) {
		this.table = table;
	}

	public Node getWhere() {
		return where;
	}

	public void setWhere(Node where) {
		this.where = where;
	}

	@Override
	protected void setupAST() {
		for (Node n : assignments) {
			n.setParent(this);
			n.setStatement(this);
			n.setupAST();
		}

		table.setParent(this);
		table.setStatement(this);
		table.setupAST();

		if (where != null) {
			where.setParent(this);
			where.setStatement(this);
			where.setupAST();
		}
	}

	@Override
	protected List<Identifier> getTableContext() throws Exception {
		List<Identifier> l = new ArrayList<Identifier>();
		l.add((Identifier) table);
		return l;
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("UPDATE");
		table.print(indent + 1);

		System.out.println("ASSGNMENT_LIST");
		for (Node n : assignments) {
			n.print(indent + 2);
		}

		printTabs(indent + 1);
		System.out.println("WHERE");
		if (where != null) {
			where.print(indent + 2);
		} else {
			printTabs(indent + 2);
			System.out.println("NONE");
		}
	}

	@Override
	public Node accept(Visitor v) throws Exception {
		if (assignments != null) {
			int len = assignments.size();
			for (int i = 0; i < len; i++) {
				assignments.set(i, assignments.get(i).accept(v));
			}
		}
		table = table.accept(v);
		if (where != null) {
			where = where.accept(v);
		}
		return v.Visit(this);
	}
}
