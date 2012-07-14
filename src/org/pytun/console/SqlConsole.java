package org.pytun.console;

import java.util.Random;
import java.util.Scanner;

import org.pytun.storage.catalog.Catalog;

public class SqlConsole {

	private static boolean exited = false;
	
	public static void Exit() {
		exited = true;
	}
	
	public static String getAuthors() {
		
		String str = "";
		Random r = new Random();
		String[] auth = { "Vasile Vilvoiu", "Andrei Janca", "Eugen Stoianovici" };
		
		int start = Math.abs(r.nextInt()) % auth.length;
		
		for (int i=0; i < auth.length; i ++) {
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
		System.out.println("");
	}
	
	// pain starts here ...
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// print hello message
		printWelcome();
		
		// initialize catalog
		Catalog cat = new Catalog("demodb");
		cat.loadFromFile();

		// main loop
		while (!exited) {

			// read command
			System.out.print(">> ");
			String line = in.nextLine();

			// parse command
			if (line.startsWith("?")) {
				// internal command
				InternalCommand ic = new InternalCommand(line, cat);
				ic.execute();
			} else {
				// sql statement
			}
			
			// blank line
			System.out.println("");
		}
		
		// uninitialize
		cat.saveToFile();
		
		// bye!
		System.out.println("Bye!");
	}

}
