package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.pytun.common.Database;
import org.pytun.sql.Identifier.IdentifierType;
import org.pytun.storage.catalog.Column;
import org.pytun.storage.catalog.Table;

public class QueryContext {
	private List<QueryTable> tables;

	private class QueryTable {
		Table table;
		String alias;
	}

	public void buildContext(List<Identifier> identifiers) throws Exception {
		tables = new ArrayList<QueryTable>();
		Table t;
		String alias;
		for (Identifier i : identifiers) {
			t = Database.catalog.getTable(i.getName());
			if (t == null) {
				throw new Exception("Table " + i.getName() + " not found");
			}
			alias = i.getPseudonym();
			if (alias == null) {
				alias = t.getName();
				i.setPseudonym(alias);
			}
			i.setIdentifierType(IdentifierType.Table);
			i.setTable(t);
			QueryTable qt = new QueryTable();
			qt.table = t;
			qt.alias = alias;
			tables.add(qt);
		}
	}

	public void resovleIdentifier(Identifier i) throws Exception {
		if (i.getIdentifierType() == IdentifierType.Table) {
			return;
		}
		String tableName = i.getTableAlias();
		if (tables == null) {
			throw new Exception("Invalid query context for identifier "
					+ i.getName());
		}

		if (tableName == null) {
			/*
			 * if the identifier does not have a table alias, we can only
			 * resolve it to a table if there is only one table in the query.
			 */
			if (tables.size() != 1) {
				throw new Exception("Identifier " + i.getName()
						+ " cannot be resolved to a table column");
			}
			tableName = tables.get(0).alias;
		}

		Column c = null;
		for (QueryTable t : tables) {
			if (t.alias.equals(tableName)) {
				c = t.table.getDescriptor().getColumn(i.getName());
				if (c == null) {
					throw new Exception("Column " + i.getName()
							+ " does not belong to table " + t.table.getName()
							+ " : " + t.alias);
				}
			}
		}

		i.setColumn(c);
		DataType d = new DataType(null);
		d.setColumnType(c.getType());
		d.setPrecision(c.getPrecision());
		d.setParent(i);
		d.setStatement(i.getStatement());
		i.setType(d);
	}

	public List<Node> expandStarIdentifier(StarIdentifier si) throws Exception {
		List<Node> identifiers = null;
		if (tables == null) {
			throw new Exception("Invalid query context for '*'");
		}
		String tableName = si.getTableAlias();
		if (tableName == null) {
			/*
			 * if the identifier does not have a table alias, we can only
			 * resolve it to a table if there is only one table in the query.
			 */
			if (tables.size() != 1) {
				throw new Exception("* is ambigous in this context");
			}
			tableName = tables.get(0).alias;
		}
		for (QueryTable t : tables) {
			if (t.alias.equals(tableName)) {
				/* get all columns and return them as a list */
				List<Column> columns = t.table.getDescriptor().getColumns();
				identifiers = new ArrayList<Node>();
				for (Column c : columns) {
					Identifier i = new Identifier(si.getNode());
					i.setName(c.getName());
					i.setPseudonym(c.getName());
					i.setTableAlias(tableName);
					i.setIdentifierType(IdentifierType.Column);
					i.setColumn(c);
					DataType d = new DataType(null);
					d.setColumnType(c.getType());
					d.setPrecision(c.getPrecision());
					d.setParent(i);
					d.setStatement(i.getStatement());
					i.setType(d);
					identifiers.add(i);
				}

			}
		}

		if (identifiers == null) {
			throw new Exception("* cannot be resolved to a table column");
		}
		return identifiers;
	}
}
