package com.generics.mealplan;


//Utility class for meal plan generation
class MealPlanGenerator {

	// Generic method to validate and generate meal plan
	public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {

		// Validate calorie range
		if (plan.getCalories() <= 0) {
			throw new IllegalArgumentException("Invalid calorie value");
		}

		// Return validated meal plan
		return new Meal<>(plan);
	}
}