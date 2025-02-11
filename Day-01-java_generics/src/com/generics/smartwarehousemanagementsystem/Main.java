package com.generics.smartwarehousemanagementsystem;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", "101", 60_000));
        electronicsStorage.addItem(new Electronics("Smartphone", "101", 30_000));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", "101", 2500));
        groceriesStorage.addItem(new Groceries("Milk", "101", 4400));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "101", 5400));
        furnitureStorage.addItem(new Furniture("Table", "101", 1100));

        // Display items using wildcard method
        System.out.println("Electronics in storage:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries in storage:");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture in storage:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
