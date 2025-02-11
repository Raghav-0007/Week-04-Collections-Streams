package com.generics.smartwarehousemanagementsystem;

public abstract class WarehouseItem {
    private String productName;
    private String id;
    private double price;

    WarehouseItem(String productName, String id, double price){
        this.productName=productName;
        this.id=id;
        this.price=price;
    }

    public void getDetails(){
        System.out.println("Product name: "+productName);
        System.out.println("Product id: "+id);
        System.out.println("Product price: "+price);
    }
}
