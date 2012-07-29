package org.pytun.execution.asl.arithmetic.mathematic;

import org.pytun.execution.ExecutionEnv;
import org.pytun.execution.asl.arithmetic.ArithNode;
import org.pytun.storage.value.*;

public abstract class ArithMath extends ArithNode {

	public abstract DbInteger evalInteger(int a, int b);
	public abstract DbDouble evalDouble(double a, double b) throws Exception;
	public abstract DbString evalString(String a, String b) throws Exception;

	@Override
	public DbValue evaluate(ExecutionEnv env) throws Exception {
		
		value = new DbNull();
		
		DbValue l = left.evaluate(env);
		DbValue r = right.evaluate(env);
		
		if (l instanceof DbInteger) {
			if (r instanceof DbInteger) {
				// int, int
				value = evalInteger(((DbInteger)l).getValue(), ((DbInteger)r).getValue()); 
			} else if (r instanceof DbDouble) {
				// int, double
				value = evalDouble(((DbInteger)l).getValue(), ((DbDouble)r).getValue());
			} else {
				throw new Exception ("Exec error: unable to compare types " + l.getType() + " and " + r.getType());
			}
		} else if (l instanceof DbDouble) {
			if (r instanceof DbInteger) {
				// double, int
				value = evalDouble(((DbDouble)l).getValue(), ((DbInteger)r).getValue());
			} else if (r instanceof DbDouble) {
				// double, double
				value = evalDouble(((DbDouble)l).getValue(), ((DbDouble)r).getValue());
			} else {
				throw new Exception ("Exec error: unable to compare types " + l.getType() + " and " + r.getType());
			}
		} else if (l instanceof DbString) {
			if (r instanceof DbString) {
				// string, string
				value = evalString(((DbString)l).getValue(), ((DbString)r).getValue());
			} else {
				throw new Exception ("Exec error: unable to compare types " + l.getType() + " and " + r.getType());
			}
		} else {
			throw new Exception ("Exec error: unable to compare types " + l.getType() + " and " + r.getType());
		}
		
		return value;
	}

}
