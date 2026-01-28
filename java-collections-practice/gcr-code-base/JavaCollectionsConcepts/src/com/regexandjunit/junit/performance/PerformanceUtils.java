package com.regexandjunit.junit.performance;

public class PerformanceUtils {

	// Simulates a long-running task
	public String longRunningTask() throws InterruptedException {
		Thread.sleep(3000); // Sleeps for 3 seconds
		return "Task Completed";
	}
}
