package com.encapsulationandpolymorphism.onlinefooddelivery;


//Veg food item class
class VegItem extends FoodItem implements Discountable {

public VegItem(String itemName, double price, int quantity) {
   super(itemName, price, quantity);
}

// Calculate total price for veg item
@Override
public double calculateTotalPrice() {
   return getPrice() * getQuantity();
}

// Apply 10% discount on veg items
@Override
public double applyDiscount() {
   return calculateTotalPrice() * 0.10;
}

@Override
public String getDiscountDetails() {
   return "Veg Item Discount @10%";
}
}
