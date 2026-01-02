package com.inheritance.hirearchiallevel.schoolsystemwithroles;

//Inheriting properties of person class
public class Staff extends Person {

  private String department;

  public Staff(String name, int age, String department) {
      super(name, age);
      this.department = department;
  }

  public void displayRole() {
      System.out.println("Staff | Department: " + department);
  }
}