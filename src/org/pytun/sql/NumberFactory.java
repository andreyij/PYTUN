package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class NumberFactory {
	public static Value getNumberValue(CommonTree t, String str) {
		Value v = null;
		if (str == null) {
			return null;
		}
		if (str.contains(".")) {
			try {
				Float f = Float.parseFloat(str);
				RealValue real = new RealValue(t);
				real.setValue(f.doubleValue());
				v = (Value)real;
			} catch (NumberFormatException e) {

			}
		} else {
			try {
				IntegerValue i = new IntegerValue(t);
				i.setValue(Integer.parseInt(str));
				v = (Value)i;
			} catch (NumberFormatException e) {

			}
		}
		return v;
	}
}
