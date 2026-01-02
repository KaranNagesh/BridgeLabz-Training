package com.inheritance.multilevel.educationcoursehirearchy;


	//Super class
	public class Course {
	    protected String courseName;
	    protected int duration; // in hours
	    
	    //parameterized constructor
	    public Course(String courseName, int duration) {
	        this.courseName = courseName;
	        this.duration = duration;
	    }

	    public void displayCourse() {
	        System.out.println("Course: " + courseName);
	        System.out.println("Duration: " + duration + " hours");
	    }
	}
