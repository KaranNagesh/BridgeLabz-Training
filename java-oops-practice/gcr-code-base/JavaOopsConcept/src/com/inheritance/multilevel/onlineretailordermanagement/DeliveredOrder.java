package com.inheritance.multilevel.onlineretailordermanagement;
//Inheriting properties of ShippedOrder
public class DeliveredOrder extends ShippedOrder  {
	protected String deliveryDate;
	public DeliveredOrder(String orderId, String orderDate, int trackingNumber,String deliveryDate ) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	public void getOrderStatus() {
		System.out.println("Order Id " + orderId);
		System.out.println("Order Date " + orderDate);
		System.out.println("Tacking number " + trackingNumber);
		System.out.println("Delivery Date " + deliveryDate);
	}
	

}