package com.generics.mealplangenerator;

public class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void displayMealPlan() {
        mealType.getMealDetails();
    }
}

