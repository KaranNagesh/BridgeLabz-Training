package com.generics.mealplan;


//Vegetarian meal plan implementation
class VegetarianMeal implements MealPlan {

	// Returns meal type
	public String getMealType() {
		return "Vegetarian";
	}

	// Returns calorie count
	public int getCalories() {
		return 2000;
	}
}