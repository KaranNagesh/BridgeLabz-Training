
package com.multithreading.threadstatemonitoring;

import java.time.LocalTime;
import java.util.*;

// StateMonitor class to monitor thread states
class StateMonitor extends Thread {

	private List<Thread> threads; // Threads to monitor
	private Map<String, Set<Thread.State>> stateHistory = new HashMap<>();

	// Constructor
	public StateMonitor(List<Thread> threads) {
		this.threads = threads;
	}

	@Override
	public void run() {

		boolean allTerminated = false;

		// Initialize state history
		for (Thread t : threads) {
			stateHistory.put(t.getName(), new HashSet<>());
		}

		while (!allTerminated) {

			allTerminated = true;

			for (Thread t : threads) {

				Thread.State state = t.getState(); // Get thread state
				stateHistory.get(t.getName()).add(state); // Store state

				// Display monitoring info
				System.out.println("[Monitor] " + t.getName() + " is in " + state + " state at " + LocalTime.now());

				// Check if any thread still running
				if (state != Thread.State.TERMINATED) {
					allTerminated = false;
				}
			}

			try {
				Thread.sleep(500); // Monitor every 500ms
			} catch (InterruptedException e) {
				System.out.println("Monitor interrupted");
			}
		}

		// Display summary
		System.out.println("\n----- Summary -----");
		for (String name : stateHistory.keySet()) {
			System.out.println("Summary: " + name + " went through " + stateHistory.get(name).size() + " states");
		}
	}
}
