package com.jdbc.crud.search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

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

	// Method to get all students details from the database
	public static void getAllStudents() {
		String sql = "SELECT * FROM students";

		try (Connection conn = getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			System.out.println("ID\tName\t\tEmail\t\t\tAge\tGrade");
			System.out.println("--------------------------------------------------------");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				String grade = rs.getString("grade");

				System.out.printf("%d\t%s\t%s\t%d\t%s%n", id, name, email, age, grade);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Select student by ID
	public static void getStudentById(int studentId) {
		String sql = "SELECT * FROM students WHERE id = ?";

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, studentId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("Student Found:");
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Name: " + rs.getString("name"));
				System.out.println("Email: " + rs.getString("email"));
				System.out.println("Age: " + rs.getInt("age"));
				System.out.println("Grade: " + rs.getString("grade"));
			} else {
				System.out.println("Student not found!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Main method
	public static void main(String[] args) {
		getAllStudents();
		System.out.println("\n");
		getStudentById(1);
	}

}