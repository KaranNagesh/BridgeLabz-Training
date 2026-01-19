package com.generics.smartwarehousemanagement;


import java.util.ArrayList;
import java.util.List;

// Generic container class with bounded type parameter
public class Container<T extends Product> {

	// List to store products
	private List<T> products = new ArrayList<>();

	// Method to add product to container
	public void addProduct(T product) {
		products.add(product);
	}

	// Method to return all products
	public List<T> getProducts() {
		return products;
	}
}