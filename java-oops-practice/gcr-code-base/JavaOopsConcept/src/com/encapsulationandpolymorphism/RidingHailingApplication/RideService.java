package com.encapsulationandpolymorphism.RidingHailingApplication;


import java.util.List;

//Utility class to calculate fares dynamically
class RideService {

 // Polymorphic method to calculate fare for any vehicle
 public static void calculateRideFare(List<Vehicle> vehicles, double distance) {

     for (Vehicle vehicle : vehicles) {

         vehicle.updateLocation("City Center");

         vehicle.getVehicleDetails();

         // Dynamic fare calculation
         double fare = vehicle.calculateFare(distance);

         System.out.println("Distance : " + distance + " km");
         System.out.println("Fare     : ₹" + fare);
         System.out.println("--------------------------------");
     }
 }
}