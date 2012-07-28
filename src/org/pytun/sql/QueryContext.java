package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.pytun.database.Database;
import org.pytun.sql.Identifier.IdentifierType;
import org.pytun.storage.catalog.Column;
import org.pytun.storage.catalog.Table;

public class QueryContext {
	private List<Table> tables;

	public void buildContext(List<Identifier> identifiers) throws Exception {
		tables = new ArrayList<Table>();
		for (Identifier i : identifiers) {
			Table t = Database.catalog.getTable(i.getName());
			if (t == null) {
				throw new Exception("Table " + i.getName() + " not found");
			}
			i.setIdentifierType(IdentifierType.Table);
			i.setTable(t);
			tables.add(t);
		}
	}

	public void resovleIdentifier(Identifier i) throws Exception {
		if (i.getIdentifierType() == IdentifierType.Table) {
			return;
		}

		if (tables == null) {
			throw new Exception("Invalid query context for identifier "
					+ i.getName());
		}

		Column c = null;
		for (Table t : tables) {
			c = t.getColumn(i.getName());
			if (c != null) {
				break;
			}
		}

		if (c == null) {
			throw new Exception("Identifier " + i.getName()
					+ " cannot be resolved to a table column");
		}

		i.setColumn(c);
		DataType d = new DataType(null);
		d.setColumnType(c.getType());
		d.setPrecision(c.getPrecision());
		d.setParent(i);
		d.setStatement(i.getStatement());
		i.setType(d);
	}
}
