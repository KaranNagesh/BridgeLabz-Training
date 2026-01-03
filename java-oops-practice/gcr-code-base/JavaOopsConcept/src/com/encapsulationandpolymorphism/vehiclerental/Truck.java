package com.encapsulationandpolymorphism.vehiclerental;

//Truck class
class Truck extends Vehicle implements Insurable {

public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
   super(vehicleNumber, "Truck", rentalRate, policyNumber);
}

// Rental cost calculation for truck (extra charge)
@Override
public double calculateRentalCost(int days) {
   return (getRentalRate() * days) + 1000; // loading charge
}

// Insurance calculation for truck
@Override
public double calculateInsurance(int days) {
   return 500 * days;
}

@Override
public String getInsuranceDetails() {
   return "Truck Insurance @ ₹500/day";
}
}