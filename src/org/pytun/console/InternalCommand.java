package org.pytun.console;

import org.pytun.common.ColumnType;
import org.pytun.storage.catalog.Catalog;
import org.pytun.storage.catalog.Column;
import org.pytun.storage.catalog.Table;

public class InternalCommand {
	
	private String[] tokens = null;
	
	private Catalog catalog;
	
	public InternalCommand(String str, Catalog cat) {
		
		// keep stuff
		catalog = cat;
		
		// skip prefix and trim
		str = str.replaceFirst("^[\\?]+", "");
		str = str.trim();
		
		// tokenize
		tokens = str.split("[\\ ]");
		
		for (int i=0; i < tokens.length; i++) {
			tokens[i] = tokens[i].toLowerCase();
		}
	}
	
	public void execute() {
		
		// ugly if chain
		String cmd = tokens[0];
		if (("exit").startsWith(cmd)) {
			SqlConsole.Exit();
		} else if (("schema").startsWith(cmd)) {
			showSchema();
		} else if (("tables").startsWith(cmd)) {
			showTables();
		} else {
			System.out.println("Invalid internal command: " + cmd);
		}
	}
	
	private void showTables() {
		// show tables
		int cnt = catalog.getTableCount();
		
		System.out.println("Tables in database '" + catalog.getDatabase() + "':");
		for (int i = 0; i < cnt; i ++) {
			System.out.println("  " + catalog.getTable(i).getName());
		}
	}
	
	private void showSchema() {
		// table info
		if (tokens.length < 2) {
			System.out.println("Please specify table!");
			return;
		}
		
		Table t = catalog.getTable(tokens[1]);
		if (t == null) {
			System.out.println("Table '" + tokens[1] + "' does not exis!");
			return;
		}
		
		System.out.println("Table '" + t.getName() + "' fields:");
		for (int i = 0; i < t.getColumnCount(); i ++) {
			Column c = t.getColumn(i);
			System.out.println(
					"  " + String.format("%-12s", c.getName()) + " " + c.getType().toString()
					+ (c.getType() == ColumnType.STRING ? "(" + c.getPrecision() + ")" : ""));
		}
	}
}
