package com.inheritance.basics.vehicleandtransportsystem;

//Inheriting properites of Vehicle class
public class Car extends Vehicle{
	private int seatCapacity;
	public Car(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Max Speed -> " + maxSpeed );
		System.out.println("Fuel Type -> " + fuelType );
		System.out.println("Seat Capacity -> " + seatCapacity );
		
	}

}