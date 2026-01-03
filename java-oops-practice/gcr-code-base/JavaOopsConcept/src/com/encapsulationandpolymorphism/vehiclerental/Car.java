package com.encapsulationandpolymorphism.vehiclerental;


//Car class extending Vehicle and implementing Insurable
class Car extends Vehicle implements Insurable {

public Car(String vehicleNumber, double rentalRate, String policyNumber) {
   super(vehicleNumber, "Car", rentalRate, policyNumber);
}

// Rental cost calculation for car
@Override
public double calculateRentalCost(int days) {
   return getRentalRate() * days;
}

// Insurance calculation for car
@Override
public double calculateInsurance(int days) {
   return 200 * days; // fixed insurance per day
}

@Override
public String getInsuranceDetails() {
   return "Car Insurance @ ₹200/day";
}
}