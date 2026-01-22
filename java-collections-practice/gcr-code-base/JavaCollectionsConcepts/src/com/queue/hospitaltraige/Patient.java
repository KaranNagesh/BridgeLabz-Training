package com.queue.hospitaltraige;


//Patient class represents a patient in triage
class Patient {

	String name;
	int severity; // Higher value = more critical

	// Constructor
	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}
}