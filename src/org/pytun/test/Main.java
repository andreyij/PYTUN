package org.pytun.test;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.SQLGrammarLexer;
import org.pytun.sql.SQLGrammarParser;

public class Main {
	public void printSQLTree(String SQLQuery) {
		System.out.println("parsing: " + SQLQuery);
		ANTLRStringStream in = new ANTLRStringStream(SQLQuery);
		SQLGrammarLexer lexer = new SQLGrammarLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SQLGrammarParser parser = new SQLGrammarParser(tokens);
		try {
			SQLGrammarParser.query_return ret = parser.query();
			CommonTree tree = (CommonTree) ret.getTree();
			//System.out.println(tree.toStringTree());
			printTree(tree, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			
			if(indent > 0) {
				for(int i = 0; i<indent - 1; i++)
					sb = sb.append("  ");
				sb = sb.append("|");				
			}
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("__");
			
			System.out.println(sb.toString() + t.getText());
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				//System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}


	public static void main(String[] args) {
		Main m = new Main();
		for (int i = 0; i < args.length; i++) {
			m.printSQLTree(args[i]);
		}
	}
}
