package com.encapsulationandpolymorphism.employeemanagement;


//Interface representing department-related behavior
interface Department {

// Assign department to an employee
void assignDepartment(String departmentName);

// Get department details of an employee
String getDepartmentDetails();
}