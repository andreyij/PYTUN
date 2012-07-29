package org.pytun.execution.asl.arithmetic.bool;

import org.pytun.execution.ExecutionEnv;
import org.pytun.execution.asl.arithmetic.ArithNode;
import org.pytun.storage.value.*;

public class ArithAnd extends ArithNode {

	public ArithAnd(ArithNode left, ArithNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public DbValue evaluate(ExecutionEnv env) throws Exception {
		
		// initialize to null
		value = new DbNull();
		
		// evaluate left/right
		DbValue l = left.evaluate(env);
		DbValue r = right.evaluate(env);

		if (!(l instanceof DbBoolean)) {
			throw new Exception("Exec error: AND arithmetic node - left is not boolean");
		} else if (!(r instanceof DbBoolean)) {
			throw new Exception("Exec error: AND arithmetic node - right is not boolean");
		}
		
		// build result
		boolean res = ((DbBoolean)l).getValue() && ((DbBoolean)r).getValue(); 
		value = new DbBoolean(res);
		
		return value;
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " AND " + right.toString() + ")";
	}

}
