package com.java.csv.basic;


import java.io.BufferedWriter; // For efficient file writing
import java.io.File; // Represents file and directory paths
import java.io.FileWriter; // Writes characters to a file
import java.io.IOException; // Handles IO exceptions

public class WriteEmployeeCSV {

	public static void main(String[] args) {

		// Define directory and file path
		String directoryPath = "output";
		String filePath = directoryPath + "/employees.csv";

		// Create directory if it does not exist
		File directory = new File(directoryPath);
		if (!directory.exists()) {
			directory.mkdir();
		}

		// Write data to CSV file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

			// Write CSV header
			writer.write("ID,Name,Department,Salary");
			writer.newLine();

			// Write employee records
			writer.write("101,Arif,Engineering,60000");
			writer.newLine();

			writer.write("102,Rahul,HR,52000");
			writer.newLine();

			writer.write("103,Neha,Marketing,55000");
			writer.newLine();

			writer.write("104,Priya,Finance,62000");
			writer.newLine();

			writer.write("105,Amit,Sales,58000");
			writer.newLine();

			// Confirmation message
			System.out.println("Employee CSV file created successfully!");

		} catch (IOException e) {
			// Handle file writing exceptions
			e.printStackTrace();
		}
	}
}