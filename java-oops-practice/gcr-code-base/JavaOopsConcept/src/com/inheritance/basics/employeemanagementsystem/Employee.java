package com.inheritance.basics.employeemanagementsystem;

public class Employee {
	String name;
	int id ;
	double salary;
	
	//default constructor
	Employee(){
		
	}
	
	
	//Parameterized constructor
	Employee(String name){
		
	}
	
	
	//Method of displaying details of an employee
	void displayDetails() {
		System.out.println(name + " employee id is " + id + " and salary is " + salary);
	}
}
