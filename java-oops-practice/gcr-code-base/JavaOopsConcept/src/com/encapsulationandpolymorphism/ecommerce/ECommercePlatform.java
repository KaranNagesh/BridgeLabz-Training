package com.encapsulationandpolymorphism.ecommerce;

import java.util.ArrayList;
import java.util.List;

// Main class
public class ECommercePlatform {

    public static void main(String[] args) {

        // Creating list of products (Polymorphism)
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "T-Shirt", 1500));
        products.add(new Groceries(3, "Rice Bag", 1200));

        // Calculate and print final prices
        BillingService.printFinalPrices(products);
    }
}