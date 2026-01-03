package com.encapsulationandpolymorphism.onlinefooddelivery;


//Interface for items on which discounts can be applied
interface Discountable {

// Apply discount on total price
double applyDiscount();

// Return discount details
String getDiscountDetails();
}