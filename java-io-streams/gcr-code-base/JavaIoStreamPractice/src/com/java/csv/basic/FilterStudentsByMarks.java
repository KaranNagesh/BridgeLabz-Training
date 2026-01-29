package com.java.csv.basic;

import java.io.BufferedReader; // For reading CSV file
import java.io.InputStreamReader; // Converts byte stream to character stream
import java.io.IOException; // Handles IO exceptions

public class FilterStudentsByMarks {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				// Load CSV file from resources folder
				FilterStudentsByMarks.class.getClassLoader().getResourceAsStream("docs/csv/studentmarks.csv")))) {

			String line;
			boolean isHeader = true; // Flag to skip header row

			System.out.println("Students with marks > 80:");
			System.out.println("--------------------------------");

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Split each line by comma
				String[] data = line.split(",");

				String id = data[0]; // Student ID
				String name = data[1]; // Student Name
				int marks = Integer.parseInt(data[3]); // Student Marks

				// Filter condition: marks greater than 80
				if (marks > 80) {
					System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
				}
			}

		} catch (IOException e) {
			// Handle file reading exceptions
			e.printStackTrace();
		}
	}
}