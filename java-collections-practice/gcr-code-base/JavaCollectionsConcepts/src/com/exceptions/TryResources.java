package com.exceptions;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {

	public static void main(String[] args) {

		// Name of the file to read
		String fileName = "info.txt";

		// try-with-resources ensures BufferedReader is closed automatically
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

			// Read and print the first line of the file
			String firstLine = reader.readLine();
			System.out.println(firstLine);

		} catch (IOException e) {
			// Handles file not found or read errors
			System.out.println("Error reading file");
		}
	}
}