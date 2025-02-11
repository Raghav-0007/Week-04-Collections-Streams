package com.generics.mealplangenerator;

public class Main {
    public static void main(String[] args) {
        // Create different meal plans
        VegetarianMeal vegetarian = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal highProtein = new HighProteinMeal();

        // Use generic class to manage meal plans
        Meal<VegetarianMeal> vegMeal = new Meal<>(vegetarian);
        Meal<VeganMeal> veganMeal = new Meal<>(vegan);
        Meal<KetoMeal> ketoMeal = new Meal<>(keto);
        Meal<HighProteinMeal> proteinMeal = new Meal<>(highProtein);

        // Display meal details
        vegMeal.displayMealPlan();
        veganMeal.displayMealPlan();
        ketoMeal.displayMealPlan();
        proteinMeal.displayMealPlan();

        // Generate personalized meal plans using a generic method
        System.out.println("\n--- Personalized Meal Plan Generation ---");
        MealPlanGenerator.generateMealPlan(vegetarian);
        MealPlanGenerator.generateMealPlan(vegan);
        MealPlanGenerator.generateMealPlan(keto);
        MealPlanGenerator.generateMealPlan(highProtein);
    }
}

