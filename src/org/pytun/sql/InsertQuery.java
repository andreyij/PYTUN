package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;

public class InsertQuery extends Query {

	private List<Node> assignments;
	private Identifier into;

	public InsertQuery(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setupAST() {
		for (Node n : assignments) {
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
		if (assignments != null) {
			int len = assignments.size();
			for (int i = 0; i < len; i++) {
				assignments.set(i, assignments.get(i).accept(v));
			}
		}
		into = (Identifier)into.accept(v);

		return v.Visit(this);
	}

	public List<Node> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Node> assignments) {
		this.assignments = assignments;
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
		System.out.println("INSERT_LIST");
		for (Node n : assignments) {
			n.print(indent + 2);
		}
	}

}
