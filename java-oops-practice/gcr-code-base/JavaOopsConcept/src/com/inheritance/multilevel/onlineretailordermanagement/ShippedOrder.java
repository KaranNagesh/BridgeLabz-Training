package com.inheritance.multilevel.onlineretailordermanagement;
//Inheriting properties of order class
public class ShippedOrder extends Order{
	protected int trackingNumber;
	public ShippedOrder(String orderId, String orderDate, int trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	public void getOrderStatus() {
		System.out.println("Order Id " + orderId);
		System.out.println("Order Date " + orderDate);
		System.out.println("Tacking number " + trackingNumber);
	}
}