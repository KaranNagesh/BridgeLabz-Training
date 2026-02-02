package javaiostreams.com.csv.csvtoobject;


import java.io.BufferedReader; // For reading CSV file
import java.io.InputStreamReader; // Converts byte stream to character stream
import java.io.IOException; // Handles IO exceptions
import java.util.ArrayList; // Implementation of List
import java.util.List; // List interface

public class CSVToStudentObject {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>(); // List to store Student objects

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				// Load CSV file from resources folder
				CSVToStudentObject.class.getClassLoader().getResourceAsStream("data/csv/students.csv")))) {

			String line;
			boolean isHeader = true; // Flag to skip header row

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Split CSV row into columns
				String[] data = line.split(",");

				// Create Student object from CSV row
				Student student = new Student(Integer.parseInt(data[0]), // ID
						data[1], // Name
						Integer.parseInt(data[2]), // Age
						Integer.parseInt(data[3]) // Marks
				);

				// Add Student object to list
				students.add(student);
			}

			// Print all Student objects
			System.out.println("Student List:");
			System.out.println("------------------------");
			for (Student s : students) {
				System.out.println(s);
			}

		} catch (IOException e) {
			// Handle file reading exceptions
			e.printStackTrace();
		}
	}
}