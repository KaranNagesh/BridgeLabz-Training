package com.inheritance.hybrid.vehiclemanagement;

//Super class
public class Vehicle {
  protected String model;
  protected int maxSpeed;

  public Vehicle(String model, int maxSpeed) {
      this.model = model;
      this.maxSpeed = maxSpeed;
  }
}