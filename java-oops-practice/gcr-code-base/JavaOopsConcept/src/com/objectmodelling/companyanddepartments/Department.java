package com.objectmodelling.companyanddepartments;
import java.util.*;

public class Department {
	public String departmentName;
	public ArrayList<Employee> employees = new ArrayList<>();
	
	public Department(String departmentName){
		this.departmentName = departmentName ;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void showEmployee() {
		System.out.println("Employees in " + departmentName + " department : ");
		for(Employee emp : employees) {
			System.out.println(emp.getEmployeeName());
		}
	}
}
