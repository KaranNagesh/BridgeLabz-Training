package com.encapsulationandpolymorphism.RidingHailingApplication;


import java.util.ArrayList;
import java.util.List;

// Main application class
public class Main {

    public static void main(String[] args) {

        // Creating list of vehicles (Polymorphism)
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", "Arif"));
        vehicles.add(new Bike("BIKE202", "Rahul"));
        vehicles.add(new Auto("AUTO303", "Suresh"));

        // Calculate fare for a 10 km ride
        RideService.calculateRideFare(vehicles, 10);
    }
}