package com.inheritance.hybrid.restaurantmanagement;

//Inheriting properties of RestaurantPerson class and implements Worker interface
public class Waiter extends RestaurantPerson implements Worker {

  public Waiter(String name, int id) {
      super(name, id);
  }

  @Override
  public void performDuties() {
      System.out.println("Waiter serves food");
  }
}