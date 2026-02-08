package com.multithreading.printshop;

//PrintJob class representing a printing task
class PrintJob implements Runnable {

	private String jobName; // Name of print job
	private int pages; // Number of pages
	private String priorityTag; // Priority label (High/Medium/Low)

	// Constructor to initialize job details
	public PrintJob(String jobName, int pages, String priorityTag) {
		this.jobName = jobName;
		this.pages = pages;
		this.priorityTag = priorityTag;
	}

	// Printing logic
	@Override
	public void run() {

		// Loop through each page
		for (int i = 1; i <= pages; i++) {
			System.out.println("[" + priorityTag + "] Printing " + jobName + " - Page " + i + " of " + pages);
			try {
				Thread.sleep(100); // Simulate printing time per page
			} catch (InterruptedException e) {
				System.out.println(jobName + " interrupted");
			}
		}
	}
}