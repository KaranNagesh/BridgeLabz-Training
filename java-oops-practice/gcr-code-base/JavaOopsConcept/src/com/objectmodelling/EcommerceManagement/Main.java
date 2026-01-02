package com.objectmodelling.EcommerceManagement;

//Created an e-commerse class that establish relationship between order, customers and product
public class Main {
  public static void main(String[] args) {
  	
  	//Create object of customer and order class
      Customers customer = new Customers();
      Order order = new Order();
      
      
      Product product1 = new Product("Mobile");
      Product product2 = new Product("Laptop");
      //Calling method to add product
      order.addProduct(product1);
      order.addProduct(product2);
      
      //Calling method to place order
      customer.placeOrder(order);
  }
}