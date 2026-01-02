package com.inheritance.multilevel.onlineretailordermanagement;

public class Main {
	public static void main(String[] args) {
		
		//Creating object of different orders
		Order order1 = new Order("123","01-Jan-2026");
		Order order2 = new ShippedOrder("123","01-Jan-2026",324234);
		Order order3 = new DeliveredOrder("123","01-Jan-2026",42342,"4-Jan-2026");
		
		//displaying different order status
		System.out.println("----------------");
		order1.getOrderStatus();
		System.out.println("----------------");
		order2.getOrderStatus();
		System.out.println("----------------");
		order3.getOrderStatus();
		System.out.println("----------------");
	}
}
