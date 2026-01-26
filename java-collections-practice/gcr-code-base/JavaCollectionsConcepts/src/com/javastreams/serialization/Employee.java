package com.javastreams.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(
                "ID : " + id +
                ", Name : " + name +
                ", Department : " + department +
                ", Salary : " + salary
        );
    }
}
