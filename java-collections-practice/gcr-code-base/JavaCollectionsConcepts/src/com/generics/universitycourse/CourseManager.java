package com.generics.universitycourse;

import java.util.List;

//Manager class to handle any type of course dynamically
class CourseManager {

	// Displays courses of any evaluation type using wildcard
	public static void showCourses(List<? extends CourseType> courses) {

		// Loop through all course types
		for (CourseType course : courses) {
			System.out.println("Evaluation Type: " + course.getEvaluationType());
		}
	}
}