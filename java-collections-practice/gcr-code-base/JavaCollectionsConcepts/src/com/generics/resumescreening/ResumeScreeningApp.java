package com.generics.resumescreening;

import java.util.ArrayList;
import java.util.List;

// Main class to test AI-driven resume screening system
public class ResumeScreeningApp {

	// Entry point of the application
	public static void main(String[] args) {

		// Create resumes for different job roles
		Resume<SoftwareEngineer> r1 = new Resume<>("Arif", 3, new SoftwareEngineer());

		Resume<DataScientist> r2 = new Resume<>("Rahul", 2, new DataScientist());

		Resume<ProductManager> r3 = new Resume<>("Neha", 5, new ProductManager());

		// Create resume list
		List<Resume<? extends JobRole>> resumeList = new ArrayList<>();

		// Add resumes to list
		resumeList.add(r1);
		resumeList.add(r2);
		resumeList.add(r3);

		// Process resumes using screening pipeline
		ScreeningPipeline.processResumes(resumeList);
	}
}