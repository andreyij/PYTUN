package org.pytun.console;

import org.pytun.common.ColumnType;
import org.pytun.common.Database;
import org.pytun.storage.catalog.Column;
import org.pytun.storage.catalog.Table;

public class InternalCommand {

	private String[] tokens = null;

	public InternalCommand(String str) {
		// skip prefix and trim
		str = str.replaceFirst("^[\\?]+", "");
		str = str.trim();

		// tokenize
		tokens = str.split("[\\ ]");

		for (int i = 0; i < tokens.length; i++) {
			tokens[i] = tokens[i].toLowerCase();
		}
	}

	public void execute() {

		// ugly if chain
		String cmd = tokens[0];
		if (("exit").startsWith(cmd)) {
			SqlConsole.Exit();
		} else if (("help").startsWith(cmd)) {
			showHelp();
		} else if (("schema").startsWith(cmd)) {
			showSchema();
		} else if (("tables").startsWith(cmd)) {
			showTables();
		} else if (("plan").startsWith(cmd)) {
			setShowPlan();
		} else if (("asl").startsWith(cmd)) {
			setShowAsl();
		} else {
			System.out.println("Invalid internal command: " + cmd);
		}
	}

	private void showHelp() {

		if (tokens.length == 1) {
			System.out.println("List of internal commands:");
			System.out
					.println("  ?help                 - show this help screen");
			System.out
					.println("  ?help sql             - show SQL command list");
			System.out
					.println("  ?help sql <command>   - show syntax of a specific sql command");
			System.out.println("  ?tables               - show table list");
			System.out
					.println("  ?schema <table>       - show schema information for table");
			System.out
					.println("  ?plan <on/off>        - show or hide plan information for executed queries");
			System.out
					.println("  ?asl <on/off>         - show or hide ASL code for executed queries");
			System.out.println("  ?exit                 - quit application");

		} else if (tokens.length == 2) {
			if (tokens[1].equals("sql")) {
				System.out.println("Supported SQL commands are:");
				System.out.println("  SELECT");
				System.out.println("  UPDATE");
				System.out.println("  INSERT");
				System.out.println("  DELETE");
				System.out.println("  CREATE");
				System.out.println("  DROP");
			} else {
				System.out.println("Invalid help topic!");
			}

		} else if (tokens.length == 3) {
			if (tokens[1].equals("sql")) {

				String cmd = tokens[2].toLowerCase();

				if (cmd.equals("select")) {
					System.out
							.println("  SELECT <expr1>, <expr2>, ... [FROM <table_joins>] [WHERE <condition_expr>] [ORDER BY <expr1>, <expr2>, ...]");
				} else if (cmd.equals("update")) {
					System.out
							.println("  UPDATE <table_name> SET <col1> = <expr1>, <col2> = <expr2>");
				} else if (cmd.equals("insert")) {
					System.out
							.println("  INSERT INTO <table_name> VALUES (<val1>, <val2>, ...)");
				} else if (cmd.equals("delete")) {
					System.out
							.println("  DELETE FROM <table_name> [WHERE <condition_expr>]");
				} else if (cmd.equals("create")) {
					System.out
							.println("  CREATE TABLE <table_name> (<col1> <type1>, <col2> <type2>, ...)");
				} else if (cmd.equals("drop")) {
					System.out.println("  DROP TABLE <table_name>");
				} else {
					System.out.println("Invalid statement!");
				}

			} else {
				System.out.println("Invalid help topic!");
			}
		}
	}

	private void showTables() {
		// show tables
		int cnt = Database.catalog.getTableCount();

		System.out.println("Tables in database '"
				+ Database.catalog.getDatabase() + "':");
		for (int i = 0; i < cnt; i++) {
			System.out.println("  " + Database.catalog.getTable(i).getName());
		}
	}

	private void showSchema() {
		// table info
		if (tokens.length < 2) {
			System.out.println("Please specify table!");
			return;
		}

		Table t = Database.catalog.getTable(tokens[1]);
		if (t == null) {
			System.out.println("Table '" + tokens[1] + "' does not exis!");
			return;
		}

		System.out.println("Table '" + t.getName() + "' columns:");
		for (int i = 0; i < t.getColumnCount(); i++) {
			Column c = t.getColumn(i);
			System.out.println("  "
					+ String.format("%-12s", c.getName())
					+ " "
					+ c.getType().toString()
					+ (c.getType() == ColumnType.STRING ? "("
							+ c.getPrecision() + ")" : ""));
		}
	}

	private void setShowPlan() {

		if (tokens.length < 2) {
			System.out.println("Please specify ON or OFF!");
			return;
		}

		String opt = tokens[1].toLowerCase();

		if (opt.equals("on")) {
			SqlConsole.setShowPlan(true);
			System.out.println("Plan dump is ON ...");
		} else if (opt.equals("off")) {
			SqlConsole.setShowPlan(false);
			System.out.println("Plan dump is OFF ...");
		} else {
			System.out.println("Please specify ON or OFF!");
		}
	}

	private void setShowAsl() {

		if (tokens.length < 2) {
			System.out.println("Please specify ON or OFF!");
			return;
		}

		String opt = tokens[1].toLowerCase();

		if (opt.equals("on")) {
			SqlConsole.setShowAsl(true);
			System.out.println("ASL dump is ON ...");
		} else if (opt.equals("off")) {
			SqlConsole.setShowAsl(false);
			System.out.println("ASL dump is OFF ...");
		} else {
			System.out.println("Please specify ON or OFF!");
		}
	}
}
