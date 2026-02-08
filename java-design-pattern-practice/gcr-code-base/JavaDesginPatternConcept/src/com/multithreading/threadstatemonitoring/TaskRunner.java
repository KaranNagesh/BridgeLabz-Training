package com.multithreading.threadstatemonitoring;

//TaskRunner class representing a task executed by a thread
class TaskRunner extends Thread {

	// Constructor to set thread name
	public TaskRunner(String name) {
		super(name);
	}

	// Thread execution logic
	@Override
	public void run() {
		try {

			// Simulate computation (RUNNABLE)
			for (int i = 0; i < 1_000_000; i++) {
				int x = i * i; // Dummy computation
			}

			// Simulate waiting state
			Thread.sleep(2000); // TIMED_WAITING

		} catch (InterruptedException e) {
			System.out.println(getName() + " interrupted");
		}
	}
}