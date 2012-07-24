package org.pytun.sql.visitors;

import java.util.List;

import org.pytun.sql.Predicate;

import org.pytun.common.ColumnType;
import org.pytun.sql.ColumnSpecification;
import org.pytun.sql.CreateQuery;
import org.pytun.sql.DataType;
import org.pytun.sql.Expression;
import org.pytun.sql.Identifier;
import org.pytun.sql.InsertQuery;
import org.pytun.sql.Node;

/**
 * @author Eugen
 * 
 */
public class SemanticVisitor extends Visitor {

	/*
	 * Checks if types of the arguments are compatible and folds constants
	 */
	@Override
	public Node Visit(Expression e) throws Exception {
		/* check types are compatible and fold constants */
		Node n = e;
		ColumnType t = e.typesCompatible();
		if (t == ColumnType.TYPE_NONE) {
			throw new Exception("Type mismatch: "
					+ DataType
							.typeAsText(e.getLeft().getType().getColumnType())
					+ e.getNode().getText()
					+ DataType.typeAsText(e.getRight().getType()
							.getColumnType()));
		}
		DataType type = new DataType(e.getNode());
		type.setColumnType(t);
		e.setType(type);
		if (e.getLeft().isConstant() && e.getRight().isConstant()) {
			n = e.performOperation();
		}
		return n;
	}

	/*
	 * Check if types of the arguments are compatible
	 */
	public Node Visit(Predicate p) throws Exception {
		/* check if types are compatible */
		if (!p.typesCompatible()) {
			throw new Exception("Type mismatch: "
					+ DataType
							.typeAsText(p.getLeft().getType().getColumnType())
					+ p.getNode().getText()
					+ DataType.typeAsText(p.getRight().getType()
							.getColumnType()));
		}
		return p;
	}

	/*
	 * Verify that columns count equals values count and that types are
	 * compatible
	 */
	@Override
	public Node Visit(InsertQuery q) throws Exception {
		List<Node> columns = q.getColumns();
		List<Node> values = q.getValues();
		if (columns == null || values == null) {
			throw new Exception("Invalid insert statement");
		}
		int count = columns.size();
		if (count != values.size()) {
			throw new Exception(
					"Columns count differs from values count (columns: "
							+ count + ", values: " + values.size() + ")");
		}

		for (int i = 0; i < count; i++) {
			/* We only accept identifiers in column specification section */
			if (!(columns.get(i) instanceof Identifier))
				throw new Exception("Invalid column specification: "
						+ columns.get(i).getClass());

			Identifier col = (Identifier) columns.get(i);
			Node val = values.get(i);
			if (col.getType().getColumnType() != val.getType().getColumnType()) {
				throw new Exception("Invalid value type for column "
						+ col.getName() + ": Found "
						+ DataType.typeAsText(val.getType().getColumnType())
						+ " expected "
						+ DataType.typeAsText(col.getType().getColumnType()));
			}
		}
		return q;
	}

	@Override
	public Node Visit(CreateQuery q) throws Exception {
		if (q.getTableName() == null) {
			throw new Exception("Table name not specified");
		}
		List<Node> columns = q.getColumns();
		/* check for duplicate columns */
		for (Node src : columns) {
			if (!(src instanceof ColumnSpecification)) {
				throw new Exception("Invalid node type "
						+ src.getNode().getText());
			}
			for (Node n : columns) {
				if (n == src) {
					continue;
				}
				if (!(n instanceof ColumnSpecification)) {
					throw new Exception("Invalid node type "
							+ n.getNode().getText());
				}

				ColumnSpecification s1 = (ColumnSpecification) src;
				ColumnSpecification s2 = (ColumnSpecification) n;
				if (s1.getName().getName().equals(s2.getName().getName()))
					throw new Exception("Duplicate column name "
							+ s1.getName().getName());
			}
		}

		for (Node n : columns) {
			ColumnSpecification cs = (ColumnSpecification) n;
			if (cs.getType() == null) {
				throw new Exception("Invalid column type " + cs.getText());
			}
		}
		return q;
	}
}
