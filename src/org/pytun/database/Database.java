package org.pytun.database;

import org.pytun.storage.catalog.Catalog;

public class Database {
	public static Catalog catalog;

	public static void initCatalog(String dbName) throws Exception {
		catalog = new Catalog(dbName);
		if (!catalog.loadFromFile()) {
			throw new Exception("Could not initialize catalog for " + dbName);
		}
	}
}
