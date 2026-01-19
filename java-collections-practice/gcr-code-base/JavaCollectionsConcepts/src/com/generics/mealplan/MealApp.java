package com.generics.mealplan;


//Main class to test meal plan generator
public class MealApp {

	// Entry point of the application
	public static void main(String[] args) {

		// Generate vegetarian meal plan
		Meal<VegetarianMeal> vegMeal = MealPlanGenerator.generateMealPlan(new VegetarianMeal());

		// Generate keto meal plan
		Meal<KetoMeal> ketoMeal = MealPlanGenerator.generateMealPlan(new KetoMeal());

		// Generate high-protein meal plan
		Meal<HighProteinMeal> proteinMeal = MealPlanGenerator.generateMealPlan(new HighProteinMeal());

		// Display generated meal plans
		vegMeal.displayMeal();
		ketoMeal.displayMeal();
		proteinMeal.displayMeal();
	}
}
