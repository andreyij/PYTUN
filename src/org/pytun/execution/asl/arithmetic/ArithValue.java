package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;
import org.pytun.execution.asl.DbValueContainer;
import org.pytun.storage.value.DbValue;

public class ArithValue extends ArithNode {

	private DbValueContainer valueCont;

	public ArithValue(String n, DbValueContainer cont) {
		valueCont = cont;
	}
	
	@Override
	public DbValue evaluate(ExecutionEnv env) throws Exception {
		return valueCont.getValue();
	}

	@Override
	public String toString() {
		return valueCont.toString();
	}

}
