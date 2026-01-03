package com.encapsulationandpolymorphism.hospitalmanagement;

//Abstract base class for all patients
abstract class Patient implements MedicalRecord {

// Encapsulated basic patient details
private int patientId;
private String name;
private int age;

// Sensitive medical information (encapsulated)
private String diagnosis;
private String medicalHistory;

// Constructor to initialize patient details
public Patient(int patientId, String name, int age) {
   this.patientId = patientId;
   this.name = name;
   this.age = age;
}

// Abstract method for bill calculation
public abstract double calculateBill();

// Concrete method to display patient details
public void getPatientDetails() {
   System.out.println("Patient ID : " + patientId);
   System.out.println("Name       : " + name);
   System.out.println("Age        : " + age);
}

// Interface method to add medical record
@Override
public void addRecord(String diagnosis, String treatment) {
   this.diagnosis = diagnosis;
   this.medicalHistory = treatment;
}

// Interface method to view medical record (controlled access)
@Override
public void viewRecords() {
   System.out.println("Diagnosis       : " + (diagnosis != null ? diagnosis : "Not Available"));
   System.out.println("Medical History : " + (medicalHistory != null ? medicalHistory : "Not Available"));
}

// Protected helper method for subclasses (data not exposed publicly)
protected int getAge() {
   return age;
}
}
