package org.pytun.sql;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.storage.catalog.Table;

public class Query extends Node {
	protected List<Table> tables;
	public Query(CommonTree t) {
		super(t);
	}
	
	public void resolveIdentifier (Identifier i){
		
	}
	
	public void addTable(Identifier i){
		
	}
}
