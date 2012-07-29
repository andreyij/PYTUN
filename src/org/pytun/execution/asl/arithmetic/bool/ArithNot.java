package org.pytun.execution.asl.arithmetic.bool;

import org.pytun.execution.ExecutionEnv;
import org.pytun.execution.asl.arithmetic.ArithNode;
import org.pytun.storage.value.DbBoolean;
import org.pytun.storage.value.DbNull;
import org.pytun.storage.value.DbValue;

public class ArithNot extends ArithNode {

	public ArithNot(ArithNode val) {
		this.left = val;
	}
	
	@Override
	public DbValue evaluate(ExecutionEnv env) throws Exception {
		// initialize to null
		value = new DbNull();
		
		// evaluate left
		DbValue l = left.evaluate(env);

		if (!(l instanceof DbBoolean)) {
			throw new Exception("Exec error: NOT arithmetic node - left is not boolean");
		}
		
		// build result
		boolean res = !((DbBoolean)l).getValue(); 
		value = new DbBoolean(res);

		return value;
	}

	@Override
	public String toString() {
		return "(NOT " + left.toString() + ")";
	}

}
