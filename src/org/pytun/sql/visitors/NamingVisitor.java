package org.pytun.sql.visitors;

import org.pytun.database.Database;
import org.pytun.sql.CreateQuery;
import org.pytun.sql.Identifier;
import org.pytun.sql.Node;
import org.pytun.sql.Query;
import org.pytun.storage.catalog.Table;

public class NamingVisitor extends Visitor {

	
	/* 
	 * Resolve column names to database tables
	 */
	@Override
	public Node Visit(Identifier i) throws Exception {
		if (i.getIdentifierType() == Identifier.IdentifierType.Table)
			return i;

		if (!(i.getStatement() instanceof Query)) {
			throw new Exception("Identifier " + i.getName()
					+ " found without query");
		}

		Query q = (Query) i.getStatement();
		q.resolveIdentifier(i);
		return i;
	}

	/* 
	 * Verify that the table name is unique in the database
	 */
	@Override
	public Node Visit(CreateQuery q) throws Exception {
		Identifier tableName = q.getTableName();
		Table t = Database.catalog.getTable(tableName.getName());
		if (t != null) {
			throw new Exception("Table " + tableName.getName()
					+ " already exists");
		}
		return q;
	}

}
