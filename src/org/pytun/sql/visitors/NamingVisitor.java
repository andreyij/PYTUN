package org.pytun.sql.visitors;

import java.util.ArrayList;
import java.util.List;

import org.pytun.database.Database;
import org.pytun.sql.CreateQuery;
import org.pytun.sql.Expression;
import org.pytun.sql.Identifier;
import org.pytun.sql.Node;
import org.pytun.sql.Query;
import org.pytun.sql.SelectQuery;
import org.pytun.sql.StarIdentifier;
import org.pytun.storage.catalog.Table;

public class NamingVisitor extends Visitor {

	/*
	 * Resolve identifier names to database columns
	 */
	@Override
	public Node Visit(Identifier i) throws Exception {
		/* skip over star identifiers, they will be resolved later */
		if (i instanceof StarIdentifier){
			return i;
		}
		/* skip over tables, these are resolved outside of this scope */
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

	@Override
	public Node Visit(SelectQuery q) throws Exception {
		/* expand star to column list */
		List<Node> selectList = q.getSelectList();
		List<Node> newList = new ArrayList<Node>();
		StarIdentifier si = null;
		for (int i = 0; i < selectList.size(); i++) {
			if (selectList.get(i) instanceof StarIdentifier) {
				si = (StarIdentifier) selectList.get(i);
				newList.addAll(q.expandStarIdentifier(si));
			} else {
				newList.add(selectList.get(i));
			}
		}
		q.setSelectList(newList);
		/* find i in the select list */
		return q;
	}

}
