package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.common.ColumnType;

public class ArithmeticExpression extends Expression {

	public ArithmeticExpression(CommonTree t) {
		super(t);
	}

	public ArithmeticExpression(CommonTree t, Node left, Node right) {
		super(t);
		this.left = left;
		this.right = right;
	}
	@Override
	public ColumnType typesCompatible(){
		DataType leftType = getLeft().getType();
		DataType rightType = getRight().getType();
		switch (leftType.getColumnType()){
			case INTEGER:
				switch (rightType.getColumnType()){
				case INTEGER:
					return ColumnType.INTEGER;
				case DOUBLE:
					return ColumnType.DOUBLE;
				default:
					return ColumnType.TYPE_NONE;
				}				
			case DOUBLE:
				switch (rightType.getColumnType()){
				case INTEGER:
				case DOUBLE:
					return ColumnType.DOUBLE;
				default:
					return ColumnType.TYPE_NONE;
				}				
			case STRING:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case BOOLEAN:
				return ColumnType.TYPE_NONE;
		}
		return ColumnType.TYPE_NONE;
	}

}
