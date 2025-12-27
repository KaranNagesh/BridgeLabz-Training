package com.constructorandinstance.level1;

public class Course {
	String courseName;
	int duration;
	double fees;
	static String instituteName;
	
	Course(String courseName,int duration,double fees, String instituteName){
		this.courseName =  courseName;
		this.duration = duration;
		this.fees = fees;
		this.instituteName = instituteName;
	}
	public void displayCourseDetails() {
	System.out.println("Course Name : "+courseName);
	System.out.println("Duration : "+duration+ "year");
	System.out.println("Fees : "+fees);
	
	}
	
	public void updateInstituteName(){
		System.out.println("InstituteName : "+instituteName);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c = new Course("AIML",4,1200,"TIT");
		c.displayCourseDetails();
		 c.updateInstituteName();
	}

}
