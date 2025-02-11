package com.generics.mealplangenerator;

public class KetoMeal implements MealPlan {
    @Override
    public void getMealDetails() {
        System.out.println("Keto Meal: High in fats, moderate in protein, low in carbs.");
    }
}

