package com.queue.basic;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

	// Method to generate first N binary numbers
	static void generateBinary(int n) {

		// Edge case
		if (n <= 0) {
			return;
		}

		Queue<String> queue = new LinkedList<>();

		// Start with "1"
		queue.add("1");

		// Generate N binary numbers
		for (int i = 0; i < n; i++) {

			// Get front of queue
			String current = queue.remove();

			// Print current binary number
			System.out.print(current + " ");

			// Add next binary numbers to queue
			queue.add(current + "0");
			queue.add(current + "1");
		}
	}

	public static void main(String[] args) {

		int n = 5;

		System.out.print("First " + n + " binary numbers: ");
		generateBinary(n);
	}
}