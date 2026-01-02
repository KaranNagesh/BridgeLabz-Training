package com.inheritance.basics.employeemanagementsystem;

public class Main {

	public static void main(String[] args) {
		
		//Creating intern
		Intern intern1 = new Intern();
		intern1.name = "Abhishek";
		intern1.id = 1;
		intern1.salary = 26000;
		
		//creating developer
		Developer developer1 = new Developer();
		developer1.name = "Ansh";
		developer1.id = 2;
		developer1.salary = 35000;
		
		//creating manager
		Manager manager1 = new Manager();
		manager1.name = "Sharad";
		manager1.id = 3;
		manager1.salary = 30000;
		
		
		//displaying details about everyone
		intern1.displayDetails();
		developer1.displayDetails();
		manager1.displayDetails();
	}
}
