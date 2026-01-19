package com.generics.resumescreening;


//Utility class for resume screening logic
class ResumeScreeningUtil {

	// Generic method to screen a resume
	public static <T extends JobRole> boolean screenResume(Resume<T> resume) {

		// Check if candidate meets experience requirement
		return resume.getExperience() >= resume.getJobRole().getMinExperience();
	}
}