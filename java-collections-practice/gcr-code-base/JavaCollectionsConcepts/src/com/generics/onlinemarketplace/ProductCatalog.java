package com.generics.onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

// Catalog that can store multiple product categories safely
class ProductCatalog {

	// List to hold products of different categories
	private List<Product<? extends Category>> products = new ArrayList<>();

	// Adds product to catalog
	public void addProduct(Product<? extends Category> product) {
		products.add(product);
	}

	// Displays all products in catalog
	public void showCatalog() {
		for (Product<? extends Category> product : products) {
			product.display();
		}
	}
}
