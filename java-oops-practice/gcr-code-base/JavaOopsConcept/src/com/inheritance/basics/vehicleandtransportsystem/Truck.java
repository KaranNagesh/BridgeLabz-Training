package com.inheritance.basics.vehicleandtransportsystem;

//Inheriting properites of Vehicle class
public class Truck extends Vehicle{
	private int wheel;
	public Truck(int maxSpeed, String fuelType,int wheel) {
		super(maxSpeed, fuelType);
		this.wheel = wheel;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Max Speed -> " + maxSpeed );
		System.out.println("Fuel Type -> " + fuelType );
		System.out.println("Number of Wheels -> " + wheel );
		
	}
}