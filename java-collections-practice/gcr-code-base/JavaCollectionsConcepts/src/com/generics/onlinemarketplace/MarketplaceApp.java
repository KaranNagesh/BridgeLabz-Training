package com.generics.onlinemarketplace;


//Main class to run the application
public class MarketplaceApp {

	// Entry point of the program
	public static void main(String[] args) {

		// Create a book product
		Product<BookCategory> book = new Product<>("Java Mastery", 499.0, new BookCategory());

		// Create a clothing product
		Product<ClothingCategory> shirt = new Product<>("Denim Shirt", 1299.0, new ClothingCategory());

		// Create a gadget product
		Product<GadgetCategory> phone = new Product<>("Smartphone", 19999.0, new GadgetCategory());

		// Apply discount to book
		DiscountUtil.applyDiscount(book, 10);

		// Apply discount to phone
		DiscountUtil.applyDiscount(phone, 5);

		// Create product catalog
		ProductCatalog catalog = new ProductCatalog();

		// Add products to catalog
		catalog.addProduct(book);
		catalog.addProduct(shirt);
		catalog.addProduct(phone);

		// Display catalog
		catalog.showCatalog();
	}
}