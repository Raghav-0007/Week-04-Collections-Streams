package com.generics.dynamiconlinemarketplace;

public class Product<T>{
    private String name;
    private String id;
    private double price;
    T category;

    public Product(String name, String id, double price, T category){
        this.name=name;
        this.id=id;
        this.price=price;
        this.category=category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (Category: " + category.getClass().getSimpleName() + ", Price: $" + price + ")";
    }
}
