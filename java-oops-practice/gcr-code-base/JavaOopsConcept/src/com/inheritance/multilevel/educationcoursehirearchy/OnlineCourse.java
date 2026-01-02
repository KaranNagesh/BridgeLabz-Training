package com.inheritance.multilevel.educationcoursehirearchy;

	//Inheriting properties of Course class
public class OnlineCourse extends Course {

	   protected String platform;
	   protected boolean isRecorded;
	    
	    //parameterized constructor
	   public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
	        super(courseName, duration);
	        this.platform = platform;
	        this.isRecorded = isRecorded;
	    }

	   public void displayOnlineDetails() {
	        displayCourse();
	        System.out.println("Platform: " + platform);
	        System.out.println("Recorded: " + isRecorded);
	    }
	}

