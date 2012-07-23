package org.pytun.sql.visitors;

import org.pytun.sql.Predicate;

import org.pytun.common.ColumnType;
import org.pytun.sql.DataType;
import org.pytun.sql.Expression;
import org.pytun.sql.Node;

public class SemanticVisitor extends Visitor {

	@Override
	public Node Visit(Expression e) throws Exception {
		/* check types are compatible and fold constants */
		Node n = e;
		ColumnType t = e.typesCompatible();
		if (t == ColumnType.TYPE_NONE) {
			throw new Exception("Type mismatch: "
					+ DataType.typeAsText(e.getLeft().getType().getColumnType())
					+ e.getNode().getText()
					+ DataType.typeAsText(e.getRight().getType().getColumnType()));
		}
		DataType type = new DataType(e.getNode());
		type.setColumnType(t);
		e.setType(type);
		if (e.getLeft().isConstant() && e.getRight().isConstant()) {
			n = e.performOperation();
		}
		return n;
	}

	public Node Visit(Predicate p) throws Exception {
		/* check if types are compatible */
		if (!p.typesCompatible()) {
			throw new Exception("Type mismatch: "
					+ DataType .typeAsText(p.getLeft().getType().getColumnType())
					+ p.getNode().getText()
					+ DataType.typeAsText(p.getRight().getType() .getColumnType()));
		}
		return p;
	}
}
