package com.constructorsandinstances.level1;

public class Student {
	//Attribute
	public String rollNumber ;
	protected String name;
	private Double CGPA;
	
	
	//Parameterized constructor
	Student( String rollNumber, String name , double CGPA){
		this.rollNumber = rollNumber;
		this.name = name;
		this.setCGPA(CGPA);
	}


	public Double getCGPA() {
		return CGPA;
	}


	public void setCGPA(Double cGPA) {
		CGPA = cGPA;
	}
	
}
