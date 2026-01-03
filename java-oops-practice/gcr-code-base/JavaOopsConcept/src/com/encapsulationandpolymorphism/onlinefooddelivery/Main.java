package com.encapsulationandpolymorphism.onlinefooddelivery;


import java.util.ArrayList;
import java.util.List;

// Main application class
public class Main {

    public static void main(String[] args) {

        // Creating list of food items (Polymorphism)
        List<FoodItem> orderItems = new ArrayList<>();

        orderItems.add(new VegItem("Paneer Butter Masala", 250, 2));
        orderItems.add(new NonVegItem("Chicken Biryani", 300, 1));
        orderItems.add(new VegItem("Butter Naan", 40, 4));

        // Process the order
        OrderProcessor.processOrder(orderItems);
    }
}