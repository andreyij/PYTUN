package org.pytun.sql.visitors;

import org.pytun.sql.Identifier;
import org.pytun.sql.Node;
import org.pytun.sql.Query;

public class NamingVisitor extends Visitor {

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
}
