package com.encapsulationandpolymorphism.ecommerce;
//Grocery product class (no tax applied)
class Groceries extends Product {

public Groceries(int productId, String name, double price) {
   super(productId, name, price);
}

// Discount logic for groceries
@Override
public double calculateDiscount() {
   return getPrice() * 0.05; // 5% discount
}
}