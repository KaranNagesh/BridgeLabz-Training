package com.jdbc.connectionestablish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	// Data base credentials
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/library_db";
	private static final String USER = "root";
	private static final String PASSWORD = "Karan@2004";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			// Load Mysql jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Database connected successfully!");
		} catch (ClassNotFoundException e) {
			System.err.println("Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Connection failed!");
			e.printStackTrace();
		}

		return connection;
	}

	// Main method
	public static void main(String[] args) {

		// Calling method to get connection
		Connection conn = getConnection();
		if (conn != null) {
			try {
				conn.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
