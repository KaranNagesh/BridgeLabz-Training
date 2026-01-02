package com.inheritance.multilevel.educationcoursehirearchy.schoolsystemwithroles;

//Inheriting properties of person class
public class Student extends Person {

  private String grade;

  public Student(String name, int age, String grade) {
      super(name, age);
      this.grade = grade;
  }

  public void displayRole() {
      System.out.println("Student | Grade: " + grade);
  }
}