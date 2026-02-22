package com.jdbc.connectionestablish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionSingleton {

	// Establishing connection using connection singleton
	private static DatabaseConnectionSingleton instance;
	private Connection connection;
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/library_db";
	private static final String USER = "root";
	private static final String PASSWORD = "Karan@2004";

	private DatabaseConnectionSingleton() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (ClassNotFoundException e) {
			throw new SQLException("Database Driver not found", e);

		}
	}

	// Static method to give instance
	public static DatabaseConnectionSingleton getInstance() throws SQLException {
		if (instance == null || instance.getConnection().isClosed()) {
			instance = new DatabaseConnectionSingleton();
		}
		return instance;
	}

	// Method to get connection
	public Connection getConnection() {
		return connection;
	}

}
