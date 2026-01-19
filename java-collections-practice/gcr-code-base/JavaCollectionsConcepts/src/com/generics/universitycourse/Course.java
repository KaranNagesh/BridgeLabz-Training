package com.generics.universitycourse;


//Generic Course class restricted to CourseType hierarchy
class Course<T extends CourseType> {

	// Course name
	private String courseName;

	// Course department
	private String department;

	// Evaluation type
	private T courseType;

	// Constructor to initialize course details
	public Course(String courseName, String department, T courseType) {
		this.courseName = courseName;
		this.department = department;
		this.courseType = courseType;
	}

	// Returns course name
	public String getCourseName() {
		return courseName;
	}

	// Returns department name
	public String getDepartment() {
		return department;
	}

	// Returns course evaluation type
	public T getCourseType() {
		return courseType;
	}

	// Displays course details
	public void display() {
		System.out.println("Course: " + courseName + ", Department: " + department + ", Evaluation: "
				+ courseType.getEvaluationType());
	}
}