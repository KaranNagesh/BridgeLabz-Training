package com.inheritance.hybrid.restaurantmanagement;

//Inheriting properties of RestaurantPerson class and implements Worker interface
public class Chef extends RestaurantPerson implements Worker {

  public Chef(String name, int id) {
      super(name, id);
  }

  @Override
  public void performDuties() {
      System.out.println("Chef prepares food");
  }
}