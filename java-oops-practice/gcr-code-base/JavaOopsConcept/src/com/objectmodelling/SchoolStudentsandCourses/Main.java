package com.objectmodelling.SchoolStudentsandCourses;

public class Main {
	public static void main(String[] args) {
		School school1 = new School("STVM");
		Student stu1 = new Student("Karan");
		school1.addStudent(stu1);
		Student stu2 = new Student("Ansh");
		school1.addStudent(stu2);
		school1.allStudents();
		
		Course course1 = new Course("CSE");
		Course course2 = new Course("Maths");
		Course course3 = new Course("Physics");
		
		Student stu3 = new Student("Pranjal");
		Student stu4 = new Student("Titu");
		Student stu5 = new Student("Mohan");
		Student stu6 = new Student("Ramesh");
		
//		stu1.addCourse(course1);
		course1.addStudent(stu6);
		course1.getStudents();
		
		
	}
}
