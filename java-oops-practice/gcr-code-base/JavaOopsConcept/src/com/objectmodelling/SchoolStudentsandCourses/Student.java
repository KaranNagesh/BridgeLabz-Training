package com.objectmodelling.SchoolStudentsandCourses;
import java.util.*;

public class Student {
	String studentName;
	ArrayList<Course> coursesEnroll = new ArrayList<>();
	public Student(String studentName) {
		this.studentName = studentName;
	}
	
	int standard ;
	
	public String showStudentName() {
		return studentName;
	}
	
	public void addCourse(Course course){
		coursesEnroll.add(course);
	}
	
	public void removeCourse(Course course){
		coursesEnroll.remove(course);
	}
	
	public void showAllCourse() {
		System.out.println("Courses enrolled by student " + studentName + " : ");
		for(Course course : coursesEnroll) {
			System.out.println(course.getCourseName());
		}
	}
	
}
