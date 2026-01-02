package com.inheritance.hirearchiallevel.schoolsystemwithroles;

public class Main {
    public static void main(String[] args) {
    	//Creating object of different classes
        Teacher teacher = new Teacher("Arif", 30, "Mathematics");
        Student student = new Student("Rahul", 18, "12th Grade");
        Staff staff = new Staff("Suresh", 40, "Administration");

        //Displaying details
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
