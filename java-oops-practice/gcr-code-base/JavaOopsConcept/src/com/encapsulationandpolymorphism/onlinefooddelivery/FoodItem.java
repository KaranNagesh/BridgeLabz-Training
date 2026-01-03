package com.encapsulationandpolymorphism.onlinefooddelivery;


//Abstract base class for all food items
abstract class FoodItem {

// Encapsulated fields (cannot be accessed directly)
private String itemName;
private double price;
private int quantity;

// Constructor to initialize food item details
public FoodItem(String itemName, double price, int quantity) {
   this.itemName = itemName;
   this.price = price;
   this.quantity = quantity;
}

// Abstract method to calculate total price
public abstract double calculateTotalPrice();

// Concrete method to display item details
public void getItemDetails() {
   System.out.println("Item Name : " + itemName);
   System.out.println("Price     : ₹" + price);
   System.out.println("Quantity  : " + quantity);
}

// Getter methods (controlled access)
protected double getPrice() {
   return price;
}

protected int getQuantity() {
   return quantity;
}

protected String getItemName() {
   return itemName;
}
}