package com.jdbc.connectionestablish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionparameter {

	// Connection method to establish connection
	public static Connection getConnection() throws SQLException {
		Connection connection = null;
		String url = "jdbc:mysql://127.0.0.1:3306/library_db";
		java.util.Properties properties = new java.util.Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "Karan@2004");
		properties.setProperty("useSSL", "false");
		properties.setProperty("serverTimezome", "UTC");
		properties.setProperty("allowPublicKeyRetrieval", "true");
		connection = DriverManager.getConnection(url, properties);
		System.out.println("Database connected successfully!");

		return connection;

	}

	//Main method
	public static void main(String[] args) throws SQLException {
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