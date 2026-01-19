package com.generics.onlinemarketplace;


//Utility class for applying discounts
class DiscountUtil {

	// Generic method to apply discount to any Product type
	public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

		// Calculate discount amount
		double discountAmount = product.getPrice() * (percentage / 100);

		// Update product price after discount
		product.setPrice(product.getPrice() - discountAmount);
	}
}