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

		
	class PostgraduateStudent extends Student{
		public void display() {
			System.out.println("Name : "+name);
			System.out.println("Roll number : "+rollNumber);
			System.out.println("CGPA : "+getCGPA());
		}
	}


	public static void main(String agrs[]) {
	Student sc = new Student();
	Student.PostgraduateStudent p = sc.new PostgraduateStudent();
	p.rollNumber = 101;
	p.name = "bob";
	p.setCGPA(8.5);

	p.display();

	}
	
}
