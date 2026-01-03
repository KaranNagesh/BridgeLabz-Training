package com.encapsulationandpolymorphism.RidingHailingApplication;


//Auto ride implementation
class Auto extends Vehicle {

public Auto(String vehicleId, String driverName) {
   super(vehicleId, driverName, 12); // ₹12 per km
}

// Fare calculation logic for auto
@Override
public double calculateFare(double distance) {
   return (getRatePerKm() * distance) + 20; // base charge
}
}