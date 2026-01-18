package com.smartwarehousemanagement;

//Class representing home furniture items
public class HomeProduct extends Product {

	// Constructor for home product
	public HomeProduct(String productName) {
		super(productName);
	}

	// Display home product details
	public void showDetails() {
		System.out.println("Home Product: " + productName);
	}
}