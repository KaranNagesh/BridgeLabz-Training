package com.generics.resumescreening;


import java.util.List;

//Screening pipeline that can process any job role
class ScreeningPipeline {

	// Method using wildcard to process multiple job roles
	public static void processResumes(List<? extends Resume<? extends JobRole>> resumes) {

		// Iterate through all resumes
		for (Resume<? extends JobRole> resume : resumes) {

			// Display resume details
			resume.display();

			// Screen resume and show result
			boolean selected = ResumeScreeningUtil.screenResume(resume);

			System.out.println("Screening Result: " + (selected ? "Selected" : "Rejected"));
			System.out.println("-----------------------");
		}
	}
}
