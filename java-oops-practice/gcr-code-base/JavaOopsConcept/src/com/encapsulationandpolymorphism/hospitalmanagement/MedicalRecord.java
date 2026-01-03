package com.encapsulationandpolymorphism.hospitalmanagement;
//Interface defining medical record operations
interface MedicalRecord {

// Add medical record details
void addRecord(String diagnosis, String treatment);

// View medical record details
void viewRecords();
}