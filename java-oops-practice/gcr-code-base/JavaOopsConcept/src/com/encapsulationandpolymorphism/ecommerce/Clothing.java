package com.encapsulationandpolymorphism.ecommerce;


//Clothing product class
class Clothing extends Product implements Taxable {

private static final double TAX_RATE = 0.05; // 5% GST

public Clothing(int productId, String name, double price) {
   super(productId, name, price);
}

// Discount logic for clothing
@Override
public double calculateDiscount() {
   return getPrice() * 0.20; // 20% discount
}

// Tax calculation
@Override
public double calculateTax() {
   return getPrice() * TAX_RATE;
}

@Override
public String getTaxDetails() {
   return "Clothing GST @5%";
}
}