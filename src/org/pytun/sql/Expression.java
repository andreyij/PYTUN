package org.pytun.sql;

import java.lang.reflect.Method;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;
import org.pytun.common.ColumnType;

public class Expression extends Node {
	protected Node left;
	protected Node right;

	public Expression(CommonTree t) {
		super(t);
	}

	public Expression(CommonTree t, Node left, Node right) {
		super(t);
		this.left = left;
		this.right = right;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	protected void setupAST() {
		if (left != null) {
			left.setParent(this);
			left.setStatement(this.getStatement());
			left.setupAST();
		}
		if (right != null) {
			right.setParent(this);
			right.setStatement(this.getStatement());
			right.setupAST();
		}
	}

	@Override
	public Node accept(Visitor v) throws Exception {
		left = left.accept(v);
		right = right.accept(v);
		return v.Visit(this);
	}

	public ColumnType typesCompatible() {
		return ColumnType.TYPE_NONE;
	}

	public Value performOperation() throws Exception {
		if (this instanceof ArithmeticExpression && left instanceof Value
				&& right instanceof Value) {
			Method method = this.getClass().getDeclaredMethod(
					"performOperation", left.getClass(), right.getClass());
			return (Value) method.invoke(this, left, right);
		}
		return null;
	}
}
