package com.encapsulationandpolymorphism.vehiclerental;


//Bike class
class Bike extends Vehicle implements Insurable {

public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
   super(vehicleNumber, "Bike", rentalRate, policyNumber);
}

// Rental cost calculation for bike
@Override
public double calculateRentalCost(int days) {
   return getRentalRate() * days;
}

// Insurance calculation for bike
@Override
public double calculateInsurance(int days) {
   return 100 * days;
}

@Override
public String getInsuranceDetails() {
   return "Bike Insurance @ ₹100/day";
}
}