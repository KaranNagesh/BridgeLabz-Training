package com.encapsulationandpolymorphism.ecommerce;

//Electronics product class
class Electronics extends Product implements Taxable {

private static final double TAX_RATE = 0.18; // 18% GST

public Electronics(int productId, String name, double price) {
   super(productId, name, price);
}

// Discount logic for electronics
@Override
public double calculateDiscount() {
   return getPrice() * 0.10; // 10% discount
}

// Tax calculation
@Override
public double calculateTax() {
   return getPrice() * TAX_RATE;
}

@Override
public String getTaxDetails() {
   return "Electronics GST @18%";
}
}