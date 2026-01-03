package com.encapsulationandpolymorphism.hospitalmanagement;


import java.util.ArrayList;
import java.util.List;

// Main application class
public class HospitalPatientManagement {

    public static void main(String[] args) {

        // List of patients (Polymorphism)
        List<Patient> patients = new ArrayList<>();

        // Creating patients
        Patient p1 = new InPatient(101, "Arif", 25, 5, 3000);
        Patient p2 = new OutPatient(102, "Rahul", 30, 800);

        // Adding medical records
        p1.addRecord("Appendicitis", "Surgery and medication");
        p2.addRecord("Fever", "Prescribed medicines");

        // Adding patients to list
        patients.add(p1);
        patients.add(p2);

        // Processing patients polymorphically
        for (Patient patient : patients) {

            patient.getPatientDetails();

            // Display medical records
            patient.viewRecords();

            // Dynamic bill calculation
            System.out.println("Total Bill : ₹" + patient.calculateBill());
            System.out.println("-----------------------------------");
        }
    }
}