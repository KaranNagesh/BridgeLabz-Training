
package com.multithreading.restaurantorder;

//Main class representing restaurant manager
public class RestaurantSystem {

	public static void main(String[] args) throws InterruptedException {

		// Create chef threads with dishes and cooking times
		Chef chef1 = new Chef("Chef-1", "Pizza", 3000); // 3 seconds
		Chef chef2 = new Chef("Chef-2", "Pasta", 2000); // 2 seconds
		Chef chef3 = new Chef("Chef-3", "Salad", 1000); // 1 second
		Chef chef4 = new Chef("Chef-4", "Burger", 2500); // 2.5 seconds

		// Start all chef threads
		chef1.start();
		chef2.start();
		chef3.start();
		chef4.start();

		// Manager waits for all chefs to finish
		chef1.join();
		chef2.join();
		chef3.join();
		chef4.join();

		// Kitchen closing message
		System.out.println("Kitchen closed - All orders completed");
	}
}
