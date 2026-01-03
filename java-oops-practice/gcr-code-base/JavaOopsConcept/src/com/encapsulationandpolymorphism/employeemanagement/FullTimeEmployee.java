package com.encapsulationandpolymorphism.employeemanagement;


//Full-time employee class
class FullTimeEmployee extends Employee {

// Fixed monthly salary for full-time employees
private double fixedSalary;

// Constructor
public FullTimeEmployee(int employeeId, String name, double fixedSalary) {
   super(employeeId, name, fixedSalary);
   this.fixedSalary = fixedSalary;
}

// Salary calculation logic for full-time employee
@Override
public double calculateSalary() {
   return fixedSalary;
}
}