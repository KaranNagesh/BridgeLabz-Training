
package com.multithreading.restaurantorder;

//Chef class representing a worker thread
class Chef extends Thread {

	private String dishName; // Dish assigned to chef
	private int cookingTime; // Total cooking time in milliseconds

	// Constructor to initialize chef name, dish, and cooking time
	public Chef(String chefName, String dishName, int cookingTime) {
		super(chefName); // Set thread name
		this.dishName = dishName;
		this.cookingTime = cookingTime;
	}

	// Thread execution logic
	@Override
	public void run() {

		// Display start message
		System.out.println(getName() + " started preparing " + dishName);

		// Divide total time into 4 equal parts (25% each)
		int stepTime = cookingTime / 4;

		try {
			// 25% progress
			Thread.sleep(stepTime);
			System.out.println(getName() + " preparing " + dishName + ": 25% complete");

			// 50% progress
			Thread.sleep(stepTime);
			System.out.println(getName() + " preparing " + dishName + ": 50% complete");

			// 75% progress
			Thread.sleep(stepTime);
			System.out.println(getName() + " preparing " + dishName + ": 75% complete");

			// 100% progress
			Thread.sleep(stepTime);
			System.out.println(getName() + " preparing " + dishName + ": 100% complete");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
