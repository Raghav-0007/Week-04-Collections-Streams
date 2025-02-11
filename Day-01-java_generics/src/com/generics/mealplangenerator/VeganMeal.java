package com.generics.mealplangenerator;

public class VeganMeal implements MealPlan {
    @Override
    public void getMealDetails() {
        System.out.println("Vegan Meal: Plant-based foods only, no dairy or animal products.");
    }
}
