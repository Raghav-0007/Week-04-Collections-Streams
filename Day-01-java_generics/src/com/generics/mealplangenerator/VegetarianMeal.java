package com.generics.mealplangenerator;

public class VegetarianMeal implements MealPlan {
    @Override
    public void getMealDetails() {
        System.out.println("Vegetarian Meal: Includes fresh vegetables, fruits, grains, and dairy.");
    }
}

