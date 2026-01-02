package com.inheritance.hybrid.vehiclemanagement;

//Inheriting properties of Vehicle class and implementing Re-fuelable interface 
public class PetrolVehicle extends Vehicle implements Refuelable {

  public PetrolVehicle(String model, int maxSpeed) {
      super(model, maxSpeed);
  }

  @Override
  public void refuel() {
      System.out.println("Petrol vehicle is refueled");
  }
}