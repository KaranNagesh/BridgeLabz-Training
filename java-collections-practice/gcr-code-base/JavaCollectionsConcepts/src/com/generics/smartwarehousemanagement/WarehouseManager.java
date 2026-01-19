package com.generics.smartwarehousemanagement;


import java.util.List;

//Main class to manage warehouse
public class WarehouseManager {

	// Wildcard method to display products of any type
	public static void displayProducts(List<? extends Product> products) {

		// Loop through products and display details
		for (Product p : products) {
			p.showDetails();
		}
	}

	// Main method
	public static void main(String[] args) {

		// Create container for electronic products
		Container<ElectronicProduct> electronics = new Container<>();
		electronics.addProduct(new ElectronicProduct("Laptop"));
		electronics.addProduct(new ElectronicProduct("Mobile"));

		// Create container for food products
		Container<FoodProduct> foods = new Container<>();
		foods.addProduct(new FoodProduct("Rice"));
		foods.addProduct(new FoodProduct("Milk"));

		// Create container for home products
		Container<HomeProduct> homeItems = new Container<>();
		homeItems.addProduct(new HomeProduct("Sofa"));
		homeItems.addProduct(new HomeProduct("Table"));

		// Display all electronic products
		displayProducts(electronics.getProducts());

		// Display all food products
		displayProducts(foods.getProducts());

		// Display all home products
		displayProducts(homeItems.getProducts());
	}
}