package com.objectmodelling.SchoolStudentsandCourses;
import java.util.*;

public class Course {
	String courseName;
	ArrayList<Student> students = new ArrayList<>();
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public void removeStudent(Student student){
		students.remove(student);
	}
	
	public void getStudents() {
		System.out.println("Students that enrolled in " + courseName + "course : ");
		for(Student stu : students) {
			System.out.println(stu.studentName);
		}
	}
}
