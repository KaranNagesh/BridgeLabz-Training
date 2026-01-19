package com.generics.resumescreening;

//Abstract base class representing a job role
abstract class JobRole {

	// Returns the role name
	public abstract String getRoleName();

	// Returns minimum experience required (in years)
	public abstract int getMinExperience();
}