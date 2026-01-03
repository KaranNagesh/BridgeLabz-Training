package com.encapsulationandpolymorphism.onlinefooddelivery;

import java.util.List;

//Utility class to process orders
class OrderProcessor {

 // Polymorphic method to process food orders
 public static void processOrder(List<FoodItem> items) {

     double grandTotal = 0;

     for (FoodItem item : items) {

         item.getItemDetails();

         double totalPrice = item.calculateTotalPrice();
         double discount = 0;

         // Apply discount if applicable
         if (item instanceof Discountable) {
             Discountable discountItem = (Discountable) item;
             discount = discountItem.applyDiscount();
             System.out.println("Discount    : ₹" + discount);
             System.out.println("Offer       : " + discountItem.getDiscountDetails());
         }

         double finalPrice = totalPrice - discount;

         System.out.println("Total Price : ₹" + totalPrice);
         System.out.println("Final Price : ₹" + finalPrice);
         System.out.println("--------------------------------");

         grandTotal += finalPrice;
     }

     System.out.println("Grand Total Amount : ₹" + grandTotal);
 }
}