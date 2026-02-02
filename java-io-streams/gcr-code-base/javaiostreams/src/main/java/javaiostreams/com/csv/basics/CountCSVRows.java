package javaiostreams.com.csv.basics;


import java.io.BufferedReader; // Reads text efficiently
import java.io.InputStreamReader; // Converts byte stream to char stream
import java.io.IOException; // Handles IO exceptions

public class CountCSVRows {

	public static void main(String[] args) {

		int recordCount = 0; // Stores number of data rows

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				// Load CSV file from resources folder
				CountCSVRows.class.getClassLoader().getResourceAsStream("data/csv/employees.csv")))) {

			String line;
			boolean isHeader = true; // Flag to skip header row

			// Read file line by line
			while ((line = br.readLine()) != null) {

				// Skip first line (header)
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Increment count for each data row
				recordCount++;
			}

			// Print total number of records
			System.out.println("Total number of records: " + recordCount);

		} catch (IOException e) {
			// Handle file reading exceptions
			e.printStackTrace();
		}
	}
}