package com.generics.mealplan;

//Generic Meal class restricted to MealPlan implementations
class Meal<T extends MealPlan> {

	// Selected meal plan
	private T mealPlan;

	// Constructor to initialize meal plan
	public Meal(T mealPlan) {
		this.mealPlan = mealPlan;
	}

	// Returns meal plan
	public T getMealPlan() {
		return mealPlan;
	}

	// Displays meal details
	public void displayMeal() {
		System.out.println("Meal Type: " + mealPlan.getMealType() + ", Calories: " + mealPlan.getCalories());
	}
}