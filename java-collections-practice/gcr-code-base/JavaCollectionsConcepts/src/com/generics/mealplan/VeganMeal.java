package com.generics.mealplan;


//Vegan meal plan implementation
class VeganMeal implements MealPlan {

	// Returns meal type
	public String getMealType() {
		return "Vegan";
	}

	// Returns calorie count
	public int getCalories() {
		return 1800;
	}
}