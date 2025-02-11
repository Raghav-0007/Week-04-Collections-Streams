package com.generics.dynamiconlinemarketplace;

public class ProductUtils {

    public static <T extends Product<?>> void applyDiscount(T product, double discount){
        product.setPrice(product.getPrice()-discount);
    }
}
