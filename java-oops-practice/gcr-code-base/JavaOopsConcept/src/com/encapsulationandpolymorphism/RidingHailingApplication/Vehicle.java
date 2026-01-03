package com.encapsulationandpolymorphism.RidingHailingApplication;


//Abstract base class for all ride-hailing vehicles
abstract class Vehicle implements GPS {

// Encapsulated fields (secured using private access)
private String vehicleId;
private String driverName;
private double ratePerKm;

// GPS location (encapsulated)
private String currentLocation = "Unknown";

// Constructor to initialize vehicle details
public Vehicle(String vehicleId, String driverName, double ratePerKm) {
   this.vehicleId = vehicleId;
   this.driverName = driverName;
   this.ratePerKm = ratePerKm;
}

// Abstract method to calculate fare (implemented by subclasses)
public abstract double calculateFare(double distance);

// Concrete method to display vehicle details
public void getVehicleDetails() {
   System.out.println("Vehicle ID   : " + vehicleId);
   System.out.println("Driver Name : " + driverName);
   System.out.println("Rate / Km   : ₹" + ratePerKm);
   System.out.println("Location    : " + currentLocation);
}

// Protected getter for subclasses
protected double getRatePerKm() {
   return ratePerKm;
}

// GPS interface methods
@Override
public String getCurrentLocation() {
   return currentLocation;
}

@Override
public void updateLocation(String newLocation) {
   this.currentLocation = newLocation;
}
}