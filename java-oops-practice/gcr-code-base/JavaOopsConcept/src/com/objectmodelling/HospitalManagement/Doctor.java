package com.objectmodelling.HospitalManagement;

//Created a doctor class
public class Doctor {
	//private instance of class
  private String name;
  
  //Parameterized constructor
  public Doctor(String name) {
      this.name = name;
  }

  //public method to consult patient
  public void consult(Patient patient) {
      System.out.println("Dr. " + name + " consulting patient " + patient.getName());
  }
}