package com.inheritance.multilevel.educationcoursehirearchy.schoolsystemwithroles;

//Inheriting properties of person class
public class Teacher extends Person {

  private String subject;

  public Teacher(String name, int age, String subject) {
      super(name, age);
      this.subject = subject;
  }

  public void displayRole() {
      System.out.println("Teacher | Subject: " + subject);
  }
}