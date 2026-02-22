package com.jdbc.crud.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/student_db"; // Database url
	private static final String USER = "root"; // Database username
	private static final String PASSWORD = "Arif@123"; // Database password

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

	// Method to update student grade
	public static void updateStudentGrade(int studentId, String newGrade) {
		String sql = "UPDATE students SET grade = ? WHERE id = ?";

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, newGrade);
			pstmt.setInt(2, studentId);

			int rowsAffected = pstmt.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Grade updated successfully!");
			} else {
				System.out.println("Student not found!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Method to update student info
	public static void updateStudentInfo(int id, String name, String email, int age) {
		String sql = "UPDATE students SET name = ?, email = ?, age = ? WHERE id = ?";

		try (Connection conn = getConnection();

				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, age);
			pstmt.setInt(4, id);

			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " row(s) updated!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Main method
	public static void main(String[] args) {
		updateStudentGrade(1, "A+");
		updateStudentInfo(2, "Jane Smith Updated", "jane.new@email.com", 23);
	}

}
