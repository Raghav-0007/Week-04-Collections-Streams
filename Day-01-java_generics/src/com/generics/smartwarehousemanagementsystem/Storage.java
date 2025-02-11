package com.generics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    List<T> items;
    Storage(){
        items=new ArrayList<>();
    }

    // method to add items
    public void addItem(T item){
        items.add(item);
    }

    // method to get items
    public List<T> getItems(){
        return items;
    }
}
