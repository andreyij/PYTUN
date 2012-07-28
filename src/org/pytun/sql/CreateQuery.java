package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;

public class CreateQuery extends Query {
	private Identifier tableName;
	private List<Node> columns;

	public CreateQuery(CommonTree t) {
		super(t);
	}

	public Identifier getTableName() {
		return tableName;
	}

	public void setTableName(Identifier tableName) {
		this.tableName = tableName;
	}

	public List<Node> getColumns() {
		return columns;
	}

	public void setColumns(List<Node> columns) {
		this.columns = columns;
	}

	@Override
	protected void setupAST() {
		for (Node n : columns) {
			n.setParent(this);
			n.setStatement(this);
			n.setupAST();
		}
		tableName.setParent(this);
		tableName.setStatement(this);
		tableName.setupAST();
		
		for (Node n : columns){
			n.setParent(this);
			n.setStatement(this);
			n.setupAST();
		}
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("CREATE TABLE");
		tableName.print(indent + 1);

		printTabs(indent + 1);
		System.out.println("COLUMN_LIST");
		for (Node n : columns) {
			n.print(indent + 2);
		}

	}

	@Override
	protected List<Identifier> getTableContext() {
		return new ArrayList<Identifier>();
	}

	@Override
	public Node accept(Visitor v) throws Exception {
		return v.Visit(this);
	}
}
