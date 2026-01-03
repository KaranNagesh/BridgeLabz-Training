package com.encapsulationandpolymorphism.hospitalmanagement;


//InPatient class (admitted patients)
class InPatient extends Patient {

private int numberOfDays;
private double dailyCharge;

// Constructor
public InPatient(int patientId, String name, int age, int numberOfDays, double dailyCharge) {
   super(patientId, name, age);
   this.numberOfDays = numberOfDays;
   this.dailyCharge = dailyCharge;
}

// Bill calculation for in-patient
@Override
public double calculateBill() {
   return numberOfDays * dailyCharge;
}
}