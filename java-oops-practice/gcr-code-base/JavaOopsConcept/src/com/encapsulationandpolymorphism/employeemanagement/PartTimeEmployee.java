package com.encapsulationandpolymorphism.employeemanagement;


//Part-time employee class
class PartTimeEmployee extends Employee {

private int workHours;
private double hourlyRate;

// Constructor
public PartTimeEmployee(int employeeId, String name, int workHours, double hourlyRate) {
   super(employeeId, name, 0);
   this.workHours = workHours;
   this.hourlyRate = hourlyRate;
}

// Salary calculation based on hours worked
@Override
public double calculateSalary() {
   return workHours * hourlyRate;
}
}