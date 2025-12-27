package com.constructorandinstance.level1;

public class Course {
	String courseName;
	int duration;
	double fees;
	static String instituteName;
	
	Cource(String courseName,int duration,double fees, String instituteName){
		this.courseName =  courseName;
		this.duration = duration;
		this.fees = fees;
		this.instituteName = instituteName;
	}
	public void displayCourseDetails() {
	System.out.println("Cource Name : "+courseName);
	System.out.println("Duration : "+duration+ "year");
	System.out.println("Fees : "+fees);
	
	}
	
	public void updateInstituteName(){
		System.out.println("InstituteName : "+instituteName);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cource c = new Cource("AIML",4,1200,"TIT");
		c.displayCourseDetails();
		 c.updateInstituteName();
	}

}
