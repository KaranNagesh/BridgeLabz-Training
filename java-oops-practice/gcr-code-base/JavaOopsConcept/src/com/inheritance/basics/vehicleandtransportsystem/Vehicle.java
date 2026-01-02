package com.inheritance.basics.vehicleandtransportsystem;

//Super class
public class Vehicle {
	protected int maxSpeed;
	protected String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	//Method to be override
	public void displayInfo() {
		System.out.println("Displaying vehicle info");
		
	}
}