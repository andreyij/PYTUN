package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

public class UpdateQuery extends Query {
	private List<Node> updateList;
	private Node table;
	private Node where;

	public UpdateQuery(CommonTree t) {
		super(t);
		updateList = new ArrayList<Node>();
		table = null;
		where = null;
		// TODO Auto-generated constructor stub
	}

	public List<Node> getUpdateList() {
		return updateList;
	}

	public void setUpdateList(List<Node> updateList) {
		this.updateList = updateList;
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

}
