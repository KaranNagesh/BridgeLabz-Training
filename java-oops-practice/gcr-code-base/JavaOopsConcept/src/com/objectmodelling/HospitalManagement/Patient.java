package com.objectmodelling.HospitalManagement;
//Created a Patient class
public class Patient {
	//private instance of class
  private String name;

  //Parameterized constructor
  public Patient(String name) {
      this.name = name;
  }

  //Public method to get the name
  public String getName() {
      return name;
  }
}