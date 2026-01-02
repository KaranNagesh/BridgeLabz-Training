package com.objectmodelling.SchoolStudentsandCourses;

import java.util.*;

public class School {
	String schoolName;
	ArrayList<Student> students = new ArrayList<>();
	
	public School(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void allStudents() {
		for(Student stu : students) {
			System.out.println(stu.showStudentName());
		}
	}
	

	public void addStudent(Student student) {
		students.add(student);
	}
}
