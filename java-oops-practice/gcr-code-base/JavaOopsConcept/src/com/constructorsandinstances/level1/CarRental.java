package com.constructorsandinstances.level1;

public class CarRental {
	//Attribute
	String customerName;
	String carModel;
	int rentalDays;
	int costPerDay ;
	
	//Default constructor
	CarRental(){
		customerName = "Karan";
		carModel = "sedan";
		rentalDays = 2;
		costPerDay = 1500;
	}
	
	//parameterized constructor
	CarRental(String customerName, String carModel, int rentalDays, int costPerDay){
		this.customerName = customerName;
		this.carModel = carModel;
		this.costPerDay = costPerDay;
		this.rentalDays = rentalDays;
	}
	
	//function for finding total price 
	int totalPrice() {
		return costPerDay * rentalDays;
	}
	
	public static void main(String[] args) {
		CarRental car1 = new CarRental();
		car1.carModel = "xuv 700";
		car1.costPerDay = 1000;
		car1.rentalDays = 5;
		car1.customerName = "Karan Nagesh";
		int total = car1.totalPrice();
		System.out.println(total);
	}
	
}
