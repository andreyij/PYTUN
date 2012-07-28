package org.pytun.console;

import java.util.Random;
import java.util.Scanner;

import org.pytun.database.Database;
import org.pytun.sql.SqlCompiler;

public class SqlConsole {

	private static boolean exited = false;
	private static boolean showPlan = false;
	private static boolean showAsl = false;

	public static void Exit() {
		exited = true;
	}

	public static boolean isShowPlan() {
		return showPlan;
	}

	public static void setShowPlan(boolean showPlan) {
		SqlConsole.showPlan = showPlan;
	}

	public static boolean isShowAsl() {
		return showAsl;
	}

	public static void setShowAsl(boolean showAsl) {
		SqlConsole.showAsl = showAsl;
	}

	public static String getAuthors() {

		String str = "";
		Random r = new Random();
		String[] auth = { "Vasile Vilvoiu", "Andrei Janca", "Eugen Stoianovici" };

		int start = Math.abs(r.nextInt()) % auth.length;

		for (int i = 0; i < auth.length; i++) {
			str += auth[(i + start) % auth.length];

			if (i < auth.length - 2) {
				str += ", ";
			} else if (i == auth.length - 2) {
				str += " and ";
			}
		}

		return str;
	}

	public static void printWelcome() {
		System.out.println("PYTUN v0.1.0");
		System.out.println("Educational RDBMS written by " + getAuthors());
		System.out.println("Type '?help' if you feel lost!");
		System.out.println("");
	}

	// pain starts here ...
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// print hello message
		printWelcome();

		// initialize catalog
		try {
			Database.initCatalog("demodb");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

		// main loop
		while (!exited) {

			// read command
			System.out.print(">> ");
			String line = in.nextLine();

			// parse command
			if (line.startsWith("?")) {
				// internal command
				InternalCommand ic = new InternalCommand(line);
				ic.execute();
			} else {
				try{
					SqlCompiler compiler = new SqlCompiler();
					compiler.compile(line);
				} catch (Exception e){
					System.out.println("Error: "+e.getMessage());
				}
			}

			// blank line
			System.out.println("");
		}

		// destroy
		Database.catalog.saveToFile();

		// bye!
		System.out.println("Bye!");
	}

}
