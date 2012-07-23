package org.pytun.sql;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.database.Database;
import org.pytun.storage.catalog.Column;
import org.pytun.storage.catalog.Table;

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
		return null;
	}

	private void checkColumns() throws Exception {
		/* check for duplicate columns */
		for (Node src : columns) {
			if (!(src instanceof ColumnSpecification)) {
				throw new Exception("Invalid node type " + src.node.getText());
			}
			for (Node n : columns) {
				if (n == src) {
					continue;
				}
				if (!(n instanceof ColumnSpecification)) {
					throw new Exception("Invalid node type " + n.node.getText());
				}

				ColumnSpecification s1 = (ColumnSpecification) src;
				ColumnSpecification s2 = (ColumnSpecification) n;
				if (s1.getName().getName().equals(s2.getName().getName()))
					throw new Exception("Duplicate column name "
							+ s1.getName().getName());
			}
		}
	}

	/*
	 * Compile the query Create statement is a special statement, don't let it
	 * go through the normal compilation process
	 */
	@Override
	public void compile() throws Exception {
		// step one: check if there is a single table
		if (tableName == null) {
			throw new Exception("Table name not specified: " + node.getText());
		}
		Table t = Database.catalog.getTable(tableName.getName());
		if (t != null) {
			throw new Exception("Table " + tableName.getName()
					+ " already exists");
		}
		checkColumns();
		t = new Table(tableName.getName());
		for (Node n : columns) {
			ColumnSpecification cs = (ColumnSpecification) n;
			DataType d = cs.getType();
			if (d == null) {
				throw new Exception("Invalid column type " + cs.getText());
			}
			Column c = new Column(cs.getName().getName(), d.getColumnType(), d
					.getPrecision());
			t.addColumn(c);
		}
		Database.catalog.addTable(t);
		Database.catalog.saveToFile();
		Database.catalog.loadFromFile();
	}

}
