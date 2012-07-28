package org.pytun.test;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.database.Database;
import org.pytun.sql.SqlCompiler;

public class Main {
	public void printSQLTree(String SQLQuery) {
		System.out.println("parsing: " + SQLQuery);
		SqlCompiler compiler = new SqlCompiler();
		try {
			compiler.compile(SQLQuery);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printTree(CommonTree t, int indent) {
		if (t != null) {
			StringBuffer sb = new StringBuffer(indent);

			if (indent > 0) {
				for (int i = 0; i < indent - 1; i++)
					sb = sb.append("  ");
				sb = sb.append("|");
			}
			for (int i = 0; i < indent; i++)
				sb = sb.append("__");

			System.out.println(sb.toString() + t.getText() + " (type: "
					+ t.getType() + ")");
			for (int i = 0; i < t.getChildCount(); i++) {
				printTree((CommonTree) t.getChild(i), indent + 1);
			}
		}
	}

	public static void main(String[] args) {
		try {
			Database.initCatalog("demodb");
			Main m = new Main();
			for (String s : args) {
				m.printSQLTree(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
