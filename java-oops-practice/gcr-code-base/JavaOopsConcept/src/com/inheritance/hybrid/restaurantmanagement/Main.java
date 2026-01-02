package com.inheritance.hybrid.restaurantmanagement;

//main class creates and display details of objects
public class Main {
  public static void main(String[] args) {

  	//Creating object of chef and waiter class
      Worker chef = new Chef("Ramesh", 201);
      Worker waiter = new Waiter("Anil", 202);
      
      //displaying duties of chef and waiter
      chef.performDuties();
      waiter.performDuties();
  }
}