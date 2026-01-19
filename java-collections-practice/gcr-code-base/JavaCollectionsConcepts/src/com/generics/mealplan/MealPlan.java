package com.generics.mealplan;


//Base interface for all meal plans
interface MealPlan {

	// Returns meal plan type
	String getMealType();

	// Returns daily calorie range
	int getCalories();
}