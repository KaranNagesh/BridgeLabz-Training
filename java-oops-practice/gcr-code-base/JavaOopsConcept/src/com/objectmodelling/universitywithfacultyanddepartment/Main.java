package com.objectmodelling.universitywithfacultyanddepartment;

public class Main {
    public static void main(String[] args) {

    	//Created a object of university and Faculty class
        University university = new University();
        Faculty faculty = new Faculty("Dr. Kumar");

        //Calling  method to add department
        university.addDepartment(new Department("Computer Science"));
        university.closeUniversity();
    }
}
