package com.generics.onlinemarketplace;

//Generic Product class restricted to valid Category types
class Product<T extends Category> {

	// Product name
	private String name;

	// Product price
	private double price;

	// Product category
	private T category;

	// Constructor to initialize product details
	public Product(String name, double price, T category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	// Returns product price
	public double getPrice() {
		return price;
	}

	// Updates product price
	public void setPrice(double price) {
		this.price = price;
	}

	// Returns product category
	public T getCategory() {
		return category;
	}

	// Returns product name
	public String getName() {
		return name;
	}

	// Displays product details
	public void display() {
		System.out.println("Product: " + name + ", Category: " + category.getCategoryName() + ", Price: ₹" + price);
	}
}