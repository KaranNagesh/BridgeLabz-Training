package com.encapsulationandpolymorphism.hospitalmanagement;


//OutPatient class (OPD patients)
class OutPatient extends Patient {

private double consultationFee;

// Constructor
public OutPatient(int patientId, String name, int age, double consultationFee) {
   super(patientId, name, age);
   this.consultationFee = consultationFee;
}

// Bill calculation for out-patient
@Override
public double calculateBill() {
   return consultationFee;
}
}