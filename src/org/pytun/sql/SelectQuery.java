package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;
import org.pytun.sql.Identifier.IdentifierType;

public class SelectQuery extends Query {
	private List<Node> selectList;
	private List<Node> from;
	private Node where;

	/**
	 * Table list of this query
	 */
	public List<Node> getSelectList() {
		return selectList;
	}

	public void setSelectList(List<Node> selectList) {
		this.selectList = selectList;
	}

	public List<Node> getFrom() {
		return from;
	}

	public void setFrom(List<Node> from) {
		this.from = from;
	}

	public Node getWhere() {
		return where;
	}

	public void setWhere(Node where) {
		this.where = where;
	}

	public SelectQuery(CommonTree t) {
		super(t);
		selectList = new ArrayList<Node>();
		from = new ArrayList<Node>();
		where = null;
	}

	@Override
	protected void setupAST() {
		for (Node n : selectList) {
			n.setParent(this);
			n.setStatement(this);
			n.setupAST();
		}
		for (Node n : from) {
			n.setParent(this);
			n.setStatement(this);
			n.setupAST();
		}
		if (where != null) {
			where.setParent(this);
			where.setStatement(this);
			where.setupAST();
		}
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("SELECT");

		printTabs(indent + 1);
		System.out.println("SELECT_LIST");
		for (Node n : selectList) {
			n.print(indent + 2);
		}

		printTabs(indent + 1);
		System.out.println("TABLE_LIST");
		for (Node n : from) {
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
	protected List<Identifier> getTableContext() throws Exception {
		List<Identifier> l = new ArrayList<Identifier>();
		for (Node n : from) {
			if (n instanceof Identifier) {
				((Identifier) n).setIdentifierType(IdentifierType.Table);
				l.add((Identifier) n);
			} else {
				throw new Exception("Invalid note type " + n.getClass()
						+ " in from list");
			}
		}
		return l;
	}

	public Node accept(Visitor v) throws Exception {
		if (selectList != null) {
			int len = selectList.size();
			for (int i = 0; i < len; i++) {
				selectList.set(i, selectList.get(i).accept(v));
			}
		}
		for (int i = 0; i < from.size(); i++) {
			from.set(i, from.get(i).accept(v));
		}

		if (where != null) {
			where = where.accept(v);
		}
		return v.Visit(this);
	}

}
