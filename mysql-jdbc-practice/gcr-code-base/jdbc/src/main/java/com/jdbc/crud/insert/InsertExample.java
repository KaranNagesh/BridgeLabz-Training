
package com.jdbc.crud.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/student_db"; // Database url
	private static final String USER = "root"; // Database username
	private static final String PASSWORD = "Karan@2004"; // Database password

	// Method to establish connection
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");

		}

		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connection establish successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

	// Method to insert student in database table
	public static void insertStudent(String name, String email, int age, String grade) {

		String sql = "INSERT INTO students(name,email,age,grade,enrollment_date)VALUES(?,?,?,?,?)";
		try {
			Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setInt(3, age);
			statement.setString(4, grade);
			statement.setDate(5, new java.sql.Date(System.currentTimeMillis()));
			int rowsAffected = statement.executeUpdate();
			System.out.println(rowsAffected + " rows inserted succefully");

		} catch (SQLException e) {
			System.err.println("Insert failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	// Main method
	public static void main(String[] args) {
		insertStudent("Karan Nagesh", "Karan86@email.com", 21, "A+");
		insertStudent("John Doe", "john.doe@email.com", 20, "A");
		insertStudent("Jane Smith", "jane.smith@email.com", 22, "B");
	}
}
