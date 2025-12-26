package com.classandobject.level1;

public class MobilePhone {
	//Declaring variable for entering the details
	String brand;
	String model;
	double price;
	
	//Constructor
	MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void displayMobile() {
		System.out.println("Brand of mobile : " + brand );
		System.out.println("Model of mobile : " + model);
		System.out.println("Price of mobile : " + price);
	}
}
