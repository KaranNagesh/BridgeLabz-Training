package com.encapsulationandpolymorphism.onlinefooddelivery;


//Non-veg food item class
class NonVegItem extends FoodItem implements Discountable {

private static final double EXTRA_CHARGE = 50; // extra charge per item

public NonVegItem(String itemName, double price, int quantity) {
   super(itemName, price, quantity);
}

// Calculate total price including extra charge
@Override
public double calculateTotalPrice() {
   return (getPrice() * getQuantity()) + (EXTRA_CHARGE * getQuantity());
}

// Apply 5% discount on non-veg items
@Override
public double applyDiscount() {
   return calculateTotalPrice() * 0.05;
}

@Override
public String getDiscountDetails() {
   return "Non-Veg Item Discount @5%";
}
}