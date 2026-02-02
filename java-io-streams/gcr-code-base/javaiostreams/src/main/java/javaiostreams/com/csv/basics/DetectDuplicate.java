package javaiostreams.com.csv.basics;

import java.io.BufferedReader; // For reading CSV file
import java.io.InputStreamReader; // Converts byte stream to character stream

import java.io.IOException; // Handles IO exceptions
import java.util.HashSet; // Stores unique IDs
import java.util.Set; // Set interface

public class DetectDuplicate {

	public static void main(String[] args) {

		Set<String> uniqueIds = new HashSet<>(); // Stores unique IDs

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				// Load CSV file from resources folder
				DetectDuplicate.class.getClassLoader().getResourceAsStream("data/csv/employees.csv")))) {

			String line;
			boolean isHeader = true; // Flag to skip header row
			boolean foundDuplicate = false;

			System.out.println("Duplicate Records:");
			System.out.println("------------------------");

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Split CSV row into columns
				String[] data = line.split(",");

				String id = data[0]; // ID column

				// If ID already exists, it's a duplicate
				if (!uniqueIds.add(id)) {
					System.out.println("Duplicate Record → " + line);
					foundDuplicate = true;
				}
			}

			// If no duplicates found
			if (!foundDuplicate) {
				System.out.println("No duplicate records found.");
			}

		} catch (IOException e) {
			// Handle file reading exceptions
			e.printStackTrace();
		}
	}
}
