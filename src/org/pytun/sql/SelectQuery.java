package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

public class SelectQuery extends Query {
	private List<Node> selectList;
	private List<Node> from;
	private Node where;

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

}
