package com.objectmodelling.HospitalManagement;
//Created a hospital class that establish relationship between doctor and patient
public class HospitalMain {
  public static void main(String[] args) {
  	
  	//Created object of doctor and patient class
      Doctor doctor = new Doctor("Sharma");
      Patient patient = new Patient("Rahul");

      //Establishing doctor and patient relationship
      doctor.consult(patient);
  }
}