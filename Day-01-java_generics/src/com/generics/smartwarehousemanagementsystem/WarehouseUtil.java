package com.generics.smartwarehousemanagementsystem;

import java.util.List;

public class WarehouseUtil {
    // method to display items
    public static void displayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item: items){
            item.getDetails();
        }
    }
}
