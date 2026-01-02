package com.objectmodelling.universitywithfacultyanddepartment;


public class Department {
    private String deptName;

    // Departments own no faculties directly in this example (composition focuses on departments)
    Department(String deptName) {
        this.deptName = deptName;
    }

    void displayDepartment() {
        System.out.println("Department Name: " + deptName);
    }
}