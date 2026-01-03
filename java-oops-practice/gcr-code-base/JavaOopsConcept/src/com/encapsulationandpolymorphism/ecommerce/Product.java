package com.encapsulationandpolymorphism.ecommerce;


//Abstract base class for all products
abstract class Product {

// Private fields to enforce encapsulation
private int productId;
private String name;
private double price;

// Constructor to initialize product details
public Product(int productId, String name, double price) {
   this.productId = productId;
   this.name = name;
   this.price = price;
}

// Abstract method for discount calculation
public abstract double calculateDiscount();

// Getter methods (read-only access)
public int getProductId() {
   return productId;
}

public String getName() {
   return name;
}

public double getPrice() {
   return price;
}

// Setter method to update price safely
public void setPrice(double price) {
   if (price > 0) {
       this.price = price;
   }
}
}