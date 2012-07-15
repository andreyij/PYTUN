package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;
import org.pytun.sql.Value;

public class ArithConst extends ArithNode {
	
	public ArithConst(Value val) {
		value = val;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public boolean evaluate(ExecutionEnv env) {
		
		if (value == null) {
			System.out.println("Exec error: null value in ArithConst node!");
			return false;
		}
		
		// nothing to do
		return true;
	}

}
