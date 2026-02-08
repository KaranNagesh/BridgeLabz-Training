package com.multithreading.printshop;

//Main class representing the print shop
public class PrintShopScheduler {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Starting print jobs...");

		// Record start time
		long startTime = System.currentTimeMillis();

		// Create print job tasks
		PrintJob job1 = new PrintJob("Job1", 10, "Medium Priority");
		PrintJob job2 = new PrintJob("Job2", 5, "High Priority");
		PrintJob job3 = new PrintJob("Job3", 15, "Low Priority");
		PrintJob job4 = new PrintJob("Job4", 8, "Medium Priority");
		PrintJob job5 = new PrintJob("Job5", 12, "High Priority");

		// Wrap jobs in threads
		Thread t1 = new Thread(job1, "Job1");
		Thread t2 = new Thread(job2, "Job2");
		Thread t3 = new Thread(job3, "Job3");
		Thread t4 = new Thread(job4, "Job4");
		Thread t5 = new Thread(job5, "Job5");

		// Set thread priorities (1–10 range)
		t1.setPriority(5); // Medium
		t2.setPriority(8); // High
		t3.setPriority(3); // Low
		t4.setPriority(6); // Medium
		t5.setPriority(7); // High

		// Start all print job threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		// Main thread waits for all jobs to finish
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();

		// Record end time
		long endTime = System.currentTimeMillis();

		// Display total execution time
		System.out.println("All jobs completed in " + (endTime - startTime) + "ms");
	}
}