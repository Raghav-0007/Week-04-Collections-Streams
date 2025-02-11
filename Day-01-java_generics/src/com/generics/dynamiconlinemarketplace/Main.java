package com.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating Product Categories
        BookCategory bookCat = new BookCategory() {};
        ClothingCategory clothCat = new ClothingCategory() {};
        GadgetCategory gadgetCat = new GadgetCategory() {};

        // Creating Products
        Product<BookCategory> book = new Product<>("Java Programming", "101", 50.0, bookCat);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", "102", 20.0, clothCat);
        Product<GadgetCategory> phone = new Product<>("Smartphone", "103", 500.0, gadgetCat);

        // Product Catalog
        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        // Display Products
        System.out.println("Product Catalog:");
        for (Product<?> product : catalog) {
            System.out.println(product);
        }

        // Apply Discounts
        ProductUtils.applyDiscount(book, 10);
        ProductUtils.applyDiscount(shirt, 15);
        ProductUtils.applyDiscount(phone, 5);
        }
    }
