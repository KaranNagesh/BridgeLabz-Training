package com.encapsulationandpolymorphism.employeemanagement;


//Abstract base class for all employees
abstract class Employee implements Department {

// Private fields to enforce encapsulation
private int employeeId;
private String name;
private double baseSalary;
private String department;

// Constructor to initialize employee details
public Employee(int employeeId, String name, double baseSalary) {
   this.employeeId = employeeId;
   this.name = name;
   this.baseSalary = baseSalary;
}

// Abstract method to calculate salary (implemented by subclasses)
public abstract double calculateSalary();

// Concrete method to display employee details
public void displayDetails() {
   System.out.println("Employee ID   : " + employeeId);
   System.out.println("Name          : " + name);
   System.out.println("Department    : " + department);
   System.out.println("Salary        : ₹" + calculateSalary());
   System.out.println("----------------------------------");
}

// Getter and Setter methods (Encapsulation)

public int getEmployeeId() {
   return employeeId;
}

public String getName() {
   return name;
}

public double getBaseSalary() {
   return baseSalary;
}

protected void setBaseSalary(double baseSalary) {
   this.baseSalary = baseSalary;
}

// Interface method implementations
@Override
public void assignDepartment(String departmentName) {
   this.department = departmentName;
}

@Override
public String getDepartmentDetails() {
   return department;
}
}