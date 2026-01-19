package com.generics.resumescreening;

//Generic Resume class restricted to JobRole types
class Resume<T extends JobRole> {

	// Candidate name
	private String candidateName;

	// Candidate experience
	private int experience;

	// Job role applied for
	private T jobRole;

	// Constructor to initialize resume details
	public Resume(String candidateName, int experience, T jobRole) {
		this.candidateName = candidateName;
		this.experience = experience;
		this.jobRole = jobRole;
	}

	// Returns candidate experience
	public int getExperience() {
		return experience;
	}

	// Returns applied job role
	public T getJobRole() {
		return jobRole;
	}

	// Displays resume details
	public void display() {
		System.out.println("Candidate: " + candidateName + ", Role: " + jobRole.getRoleName() + ", Experience: "
				+ experience + " years");
	}
}