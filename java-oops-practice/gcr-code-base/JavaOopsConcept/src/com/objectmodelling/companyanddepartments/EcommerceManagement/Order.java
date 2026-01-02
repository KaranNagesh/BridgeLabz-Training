package com.objectmodelling.companyanddepartments.EcommerceManagement;

//Import ArrayList from java.util package
import java.util.ArrayList;


//Created a order class
public class Order {
	//Private instance of Order class
  ArrayList<Product> products = new ArrayList<>();
  
  //public method to add product
  public void addProduct(Product productss) {
     products.add(productss);
  }
}