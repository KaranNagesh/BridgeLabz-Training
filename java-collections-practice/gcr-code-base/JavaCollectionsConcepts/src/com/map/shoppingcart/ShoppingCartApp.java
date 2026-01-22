package com.map.shoppingcart;


public class ShoppingCartApp {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		// Adding products
		cart.addProduct("Laptop", 55000);
		cart.addProduct("Mouse", 500);
		cart.addProduct("Keyboard", 1200);
		cart.addProduct("Monitor", 15000);

		// Adding items to cart
		cart.addToCart("Laptop", 1);
		cart.addToCart("Mouse", 2);
		cart.addToCart("Keyboard", 1);
		cart.addToCart("Monitor", 1);

		// Display cart
		cart.displayCart();

		// Display sorted by price
		cart.displaySortedByPrice();

		// Total bill
		System.out.println("\nTotal Amount: ₹" + cart.calculateTotal());
	}
}