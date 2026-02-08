package com.multithreading.threadstatemonitoring;

import java.util.*;

//Main class to run the monitoring system
public class ThreadStateMonitoringSystem {

	public static void main(String[] args) throws InterruptedException {

		// Create TaskRunner threads (NEW state)
		TaskRunner t1 = new TaskRunner("Task-1");
		TaskRunner t2 = new TaskRunner("Task-2");

		// Store threads in list for monitoring
		List<Thread> threadList = Arrays.asList(t1, t2);

		// Create monitor thread
		StateMonitor monitor = new StateMonitor(threadList);

		// Start monitor first (observes NEW state)
		monitor.start();

		// Start task threads
		t1.start();
		t2.start();

		// Wait for tasks to finish
		t1.join();
		t2.join();

		// Wait for monitor to finish
		monitor.join();
	}
}