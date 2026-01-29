package com.java.csv.basic;
import java.io.BufferedReader; // For reading text from input stream
import java.io.InputStreamReader; // Converts byte stream to character stream
import java.io.IOException; // Handles input-output exceptions

public class ReadStudentCSV {

	public static void main(String[] args) {

		// Try-with-resources to automatically close BufferedReader
		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				// Load CSV file from src/main/resources folder
				ReadStudentCSV.class.getClassLoader().getResourceAsStream("docs/csv/students.csv")))) {

			String line; // Stores each line read from CSV
			boolean isHeader = true; // Flag to skip header row

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip the first line (header)
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Split line into columns using comma
				String[] data = line.split(",");

				String id = data[0]; // Student ID
				String name = data[1]; // Student Name
				String age = data[2]; // Student Age
				String marks = data[3]; // Student Marks

				// Print student details in structured format
				System.out.println("Student ID   : " + id);
				System.out.println("Name         : " + name);
				System.out.println("Age          : " + age);
				System.out.println("Marks        : " + marks);
				System.out.println("----------------------------");
			}

		} catch (IOException e) {
			// Print exception details if file read fails
			e.printStackTrace();
		}
	}
}