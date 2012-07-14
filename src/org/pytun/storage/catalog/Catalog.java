package org.pytun.storage.catalog;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;

public class Catalog {
	private ArrayList<Table> tables;
	private String database;

	public Catalog(String database) {
		this.database = database;
		tables = new ArrayList<Table>();
	}
	
	public boolean loadFromFile() {
		return loadFromFile(database + File.separator + "catalog");
	}
	
	public boolean loadFromFile(String file) {

		tables.clear();
		
		try {
			// open a file ... fuck you, java
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			// read line by line
			String line = null;
			while ((line = br.readLine()) != null) {
				Table t = new Table(line);
				tables.add(t);
			}
			
			in.close();
		} catch (Exception e) {
			System.out.println("Catalog file '" + file + "' could not be loaded: " + e.getMessage());
			return false;
		}
		
		return true;
	}
	
	public boolean saveToFile() {
		return saveToFile(database + File.separator + "catalog");
	}
	
	public boolean saveToFile(String file) {
		
		try {
			// open a file
			File f = new File(file);
			(new File(f.getParent())).mkdirs();
			Writer out = new BufferedWriter(new FileWriter(f));
			
			//  write serialized tables
			for (Table t: tables) {
				out.write(t.toString() + "\n");
			}

			out.close();
		} catch (Exception e) {
			System.out.println("Catalog file '" + file + "' could not be saved: " + e.getMessage());
			return false;
		}
		
		return true;
	}
	
	public String getDatabase() {
		return database;
	}
	
	public void addTable(Table t) {
		tables.add(t);
	}
	
	public boolean removeTable(int idx) {
		if (idx < 0 || idx >= tables.size()) {
			return false;
		}
		
		tables.remove(idx);
		return true;
	}
	
	public boolean removeTable(String name) {
		Table t = getTable(name);

		if (t != null) {
			tables.remove(t);
			return true;
		} else {
			return false;
		}
	}
	
	public int getTableCount() {
		return tables.size();
	}
	
	public Table getTable(int idx) {
		if (idx < 0 || idx >= tables.size()) {
			return null;
		}
		
		return tables.get(idx);
	}
	
	public Table getTable(String name) {
		for (Table t: tables) {
			if (t.getName().equals(name)) {
				return t;
			}
		}
		
		return null;
	}
}
