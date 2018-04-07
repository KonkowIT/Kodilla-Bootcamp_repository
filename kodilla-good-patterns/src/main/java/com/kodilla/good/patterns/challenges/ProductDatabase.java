package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {


    private static Map<Product, Boolean> availabilityOfProducts = new HashMap<>();

    static {
        availabilityOfProducts.put(new Product("White T-Shirt", 59), true);
    }

    public boolean isAvailable(Product product) {
        if (availabilityOfProducts.containsKey(product)){
            return availabilityOfProducts.get(product);
        }
        return false;
    }

    public void addToList(Product product, Boolean availability) {
        availabilityOfProducts.put(product, availability);
    }

    public void deleteFromList(Product product) {
        availabilityOfProducts.remove(product);
    }

    public String changeAvailability(Product product, boolean availability) {
        availabilityOfProducts.replace(product, availability);
        if (availabilityOfProducts.get(product) == availability) {
            String result = "Changed";
            return result;
        } else {
            String result = "Not changed";
            return result;
        }
    }
}
