package org.pytun.execution.asl.arithmetic.mathematic;

import org.pytun.execution.asl.arithmetic.ArithNode;
import org.pytun.storage.value.DbDouble;
import org.pytun.storage.value.DbInteger;
import org.pytun.storage.value.DbString;

public class ArithModulo extends ArithMath {

	public ArithModulo(ArithNode left, ArithNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return "(" + left.toString() + " MOD " + right.toString() + ")";
	}

	@Override
	public DbInteger evalInteger(int a, int b) {
		return new DbInteger(a % b);
	}

	@Override
	public DbDouble evalDouble(double a, double b) throws Exception {
		throw new Exception ("Exec error: MODULO operator is not applicable on DOUBLE types");
	}

	@Override
	public DbString evalString(String a, String b) throws Exception {
		throw new Exception ("Exec error: MODULO operator is not applicable on STRING types");
	}

}
