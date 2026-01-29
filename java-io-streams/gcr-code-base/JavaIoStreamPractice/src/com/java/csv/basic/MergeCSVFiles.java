package com.java.csv.basic;

import java.io.BufferedReader; // Efficient reading of large files
import java.io.FileReader; // Reads file from disk
import java.io.IOException; // Handles IO exceptions
import java.util.ArrayList; // Stores chunk of lines
import java.util.List; // List interface

public class MergeCSVFiles {

	private static final int CHUNK_SIZE = 100; // Number of lines per batch

	public static void main(String[] args) {

		String filePath = "data/large_employees.csv"; // Large CSV file path
		int totalRecords = 0; // Total processed records

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;
			boolean isHeader = true; // Flag to skip header
			List<String> batch = new ArrayList<>(CHUNK_SIZE);

			// Read file line by line (streaming)
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				batch.add(line); // Add line to current batch

				// Process when batch size reaches 100
				if (batch.size() == CHUNK_SIZE) {

					processBatch(batch); // Process 100 lines
					totalRecords += batch.size(); // Update record count
					batch.clear(); // Clear batch to free memory

					// Display progress
					System.out.println("Processed records so far: " + totalRecords);
				}
			}

			// Process remaining lines (if less than chunk size)
			if (!batch.isEmpty()) {
				processBatch(batch);
				totalRecords += batch.size();
			}

			// Final count
			System.out.println("Total records processed: " + totalRecords);

		} catch (IOException e) {
			// Handle file read exceptions
			e.printStackTrace();
		}
	}

	// Method to process a chunk of lines
	private static void processBatch(List<String> batch) {

		// Simulate processing (e.g., parsing, validation, DB insert)
		for (String record : batch) {
			// Example: do nothing or light processing
			// System.out.println(record);
		}
	}
}