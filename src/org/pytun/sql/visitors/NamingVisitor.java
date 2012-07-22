package org.pytun.sql.visitors;

import org.pytun.sql.Identifier;
import org.pytun.sql.Node;
import org.pytun.sql.Query;

public class NamingVisitor extends Visitor {

	@Override
	public Node Visit(Node n) throws Exception {
		if (n instanceof Identifier) {
			Identifier i = (Identifier) n;
			if (i.getIdentifierType() == Identifier.IdentifierType.Table) {
				return n;
			}
			if (!(i.getParent() instanceof Query)) {
				throw new Exception("Identifier " + i.getName()
						+ " found without query");
			}
			
			Query q = (Query)i.getParent();
			q.resolveIdentifier(i);
			return i;
		}
		return n;
	}

}
