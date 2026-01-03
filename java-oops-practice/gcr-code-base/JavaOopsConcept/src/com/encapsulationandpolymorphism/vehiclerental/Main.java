package com.encapsulationandpolymorphism.vehiclerental;


import java.util.ArrayList;
import java.util.List;

// Main application class
public class Main {

    public static void main(String[] args) {

        int rentalDays = 3;

        // List of vehicles (Polymorphism)
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH12AB1234", 1500, "CARPOL123456"));
        vehicles.add(new Bike("MH14XY5678", 500, "BIKEPOL987654"));
        vehicles.add(new Truck("MH20TR9999", 3000, "TRUCKPOL456789"));

        // Iterating using Vehicle reference
        for (Vehicle vehicle : vehicles) {

            vehicle.displayVehicleInfo();

            // Calculate rental cost
            double rentalCost = vehicle.calculateRentalCost(rentalDays);

            double insuranceCost = 0;

            // Check insurance applicability
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                insuranceCost = insurable.calculateInsurance(rentalDays);
                System.out.println("Insurance Info : " + insurable.getInsuranceDetails());
            }

            // Display costs
            System.out.println("Rental Days   : " + rentalDays);
            System.out.println("Rental Cost  : ₹" + rentalCost);
            System.out.println("Insurance    : ₹" + insuranceCost);
            System.out.println("Total Cost   : ₹" + (rentalCost + insuranceCost));
            System.out.println("-----------------------------------");
        }
    }
}