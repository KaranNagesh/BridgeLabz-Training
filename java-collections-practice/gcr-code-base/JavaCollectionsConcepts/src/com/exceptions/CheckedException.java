package com.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {

		// Name of the file to read
		String fileName = "data.txt";

		try {
			// FileReader may throw IOException (checked exception)
			BufferedReader reader = new BufferedReader(new FileReader(fileName));

			String line;

			// Read file line by line
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close(); // Close the file

		} catch (IOException e) {
			// Handles file not found or read error
			System.out.println("File not found");
		}
	}
}