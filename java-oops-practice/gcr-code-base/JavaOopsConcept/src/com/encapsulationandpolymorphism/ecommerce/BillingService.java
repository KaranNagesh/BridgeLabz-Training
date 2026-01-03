package com.encapsulationandpolymorphism.ecommerce;
import java.util.List;

//Utility class for billing operations
class BillingService {

// Polymorphic method to calculate and print final price
public static void printFinalPrices(List<Product> products) {

   for (Product product : products) {

       double tax = 0;

       // Check if product is taxable
       if (product instanceof Taxable) {
           tax = ((Taxable) product).calculateTax();
       }

       // Calculate discount
       double discount = product.calculateDiscount();

       // Final price formula
       double finalPrice = product.getPrice() + tax - discount;

       // Display product bill
       System.out.println("Product Name : " + product.getName());
       System.out.println("Base Price  : ₹" + product.getPrice());
       System.out.println("Tax         : ₹" + tax);
       System.out.println("Discount    : ₹" + discount);
       System.out.println("Final Price : ₹" + finalPrice);
       System.out.println("--------------------------------");
   }
}
}