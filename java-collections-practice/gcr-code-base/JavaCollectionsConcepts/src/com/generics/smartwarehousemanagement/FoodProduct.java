package com.generics.smartwarehousemanagement;


//Class representing food items
public class FoodProduct extends Product {

	// Constructor for food product
	public FoodProduct(String productName) {
		super(productName);
	}

	// Display food product details
	public void showDetails() {
		System.out.println("Food Product: " + productName);
	}
}