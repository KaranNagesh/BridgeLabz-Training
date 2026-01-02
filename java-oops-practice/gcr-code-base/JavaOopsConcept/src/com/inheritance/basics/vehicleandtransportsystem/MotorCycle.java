package com.inheritance.basics.vehicleandtransportsystem;

//Inheriting properites of Vehicle class
public class MotorCycle extends Vehicle {
	private String withTrunk;
	public MotorCycle(int maxSpeed, String fuelType, String withTrunk) {
		super(maxSpeed, fuelType);
		this.withTrunk = withTrunk;
	}
	
	public void displayInfo() {
		System.out.println("Max Speed -> " + maxSpeed );
		System.out.println("Fuel Type -> " + fuelType );
		System.out.println("With Trunk -> " + withTrunk );
		
	}

}