package com.constructorandinstance.level1;

public class Employee {

	public int employeeId;
	protected String department;
	private double salary;
	
	public void setSalary(double s) {
		salary = s;
	}
	public double getSalary() {
		return salary;
	}
	
	static class Manager extends Employee{
		void display() {
			System.out.println("Employee Id : "+employeeId);
			System.out.println("Department : "+department);
			System.out.println("Salary : "+ getSalary());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Manager m = new Manager();
         m.department = "Aiml";
         m.employeeId = 121;
         m.setSalary(255000);
         m.display();
	}

}
