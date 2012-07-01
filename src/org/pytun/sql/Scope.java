package org.pytun.sql;

import java.util.List;

import org.pytun.storage.catalog.Table;
import org.pytun.storage.catalog.Column;

import org.antlr.runtime.RecognitionException;

public class Scope {
	List<Table> tables;

	public Scope(List<Node> names) throws RecognitionException{
		for(Node n:names){
			if(!(n instanceof Identifier)){
				//throw new RecognitionException("invalid type "+n.getClass());
			}
			//TODO: add each identifier to scope
		}
	}
	public void addTable(String name) {
		/* search for the name in the catalog and add the corresponding table */
	}

	public Column searchColumn(String name) {
		if (tables == null) {
			return null;
		}
		for (Table t : tables) {
			Column c = t.getColumn(name);
			if (c != null) {
				return c;
			}
		}
		return null;
	}

	public Table searchTable(String name) {
		if (tables == null) {
			return null;
		}
		for (Table t : tables) {
			if (t.getName().equals(name))
				return t;
		}
		return null;
	}
}
