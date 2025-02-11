package com.generics.mealplangenerator;

public class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generating your personalized meal plan...");
        meal.getMealDetails();
        System.out.println("Meal plan successfully generated!\n");
    }
}

