package com.inheritance.multilevel.onlineretailordermanagement;

//Super class
public class Order {
	protected String orderId;
	protected String orderDate;
	
	//Parameterized constructor
	public Order(String orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	public void getOrderStatus() {
		System.out.println("Showing Order Status");
	}
	
}