package com.encapsulationandpolymorphism.RidingHailingApplication;


//Bike ride implementation
class Bike extends Vehicle {

public Bike(String vehicleId, String driverName) {
   super(vehicleId, driverName, 8); // ₹8 per km
}

// Fare calculation logic for bike
@Override
public double calculateFare(double distance) {
   return getRatePerKm() * distance;
}
}
