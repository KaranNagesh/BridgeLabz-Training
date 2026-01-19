package com.generics.universitycourse;
import java.util.ArrayList;
import java.util.List;

// Main class to test university course management system
public class UniversityApp {

	// Entry point of the program
	public static void main(String[] args) {

		// Create course objects with different evaluation types
		Course<ExamCourse> math = new Course<>("Mathematics", "Science", new ExamCourse());

		Course<AssignmentCourse> cs = new Course<>("Data Structures", "Computer Science", new AssignmentCourse());

		Course<ResearchCourse> phd = new Course<>("AI Research", "Research Dept", new ResearchCourse());

		// Display individual courses
		math.display();
		cs.display();
		phd.display();

		// Create list of course evaluation types
		List<CourseType> evaluationList = new ArrayList<>();

		// Add different evaluation types to list
		evaluationList.add(new ExamCourse());
		evaluationList.add(new AssignmentCourse());
		evaluationList.add(new ResearchCourse());

		// Display evaluation types dynamically using wildcard
		CourseManager.showCourses(evaluationList);
	}
}