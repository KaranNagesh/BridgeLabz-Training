package com.encapsulationandpolymorphism.employeemanagement;


import java.util.ArrayList;
import java.util.List;

// Main class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Creating a list of employees (Polymorphism)
        List<Employee> employees = new ArrayList<>();

        // Creating full-time employee
        Employee emp1 = new FullTimeEmployee(101, "Arif", 50000);
        emp1.assignDepartment("IT");

        // Creating part-time employee
        Employee emp2 = new PartTimeEmployee(102, "Rahul", 120, 300);
        emp2.assignDepartment("Support");

        // Adding employees to list
        employees.add(emp1);
        employees.add(emp2);

        // Processing employees using Employee reference
        for (Employee emp : employees) {
            emp.displayDetails(); // Polymorphic behavior
        }
    }
}