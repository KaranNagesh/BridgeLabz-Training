package com.encapsulationandpolymorphism.vehiclerental;


//Abstract base class for all vehicles
abstract class Vehicle {

// Encapsulated fields (private access)
private String vehicleNumber;
private String type;
private double rentalRate; // per day rental rate

// Sensitive information (encapsulated)
private String insurancePolicyNumber;

// Constructor to initialize vehicle details
public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
   this.vehicleNumber = vehicleNumber;
   this.type = type;
   this.rentalRate = rentalRate;
   this.insurancePolicyNumber = policyNumber;
}

// Abstract method to calculate rental cost
public abstract double calculateRentalCost(int days);

// Getter methods (controlled access)
public String getVehicleNumber() {
   return vehicleNumber;
}

public String getType() {
   return type;
}

protected double getRentalRate() {
   return rentalRate;
}

// Sensitive data not directly exposed
protected String getMaskedPolicyNumber() {
   return "XXXX-XXXX-" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
}

// Common method to display vehicle details
public void displayVehicleInfo() {
   System.out.println("Vehicle Number : " + vehicleNumber);
   System.out.println("Vehicle Type   : " + type);
   System.out.println("Rental Rate    : ₹" + rentalRate + " / day");
   System.out.println("Policy Number  : " + getMaskedPolicyNumber());
}
}