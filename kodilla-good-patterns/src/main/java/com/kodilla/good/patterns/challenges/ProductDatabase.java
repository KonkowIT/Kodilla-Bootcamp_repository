package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase {

    Map<Product, Boolean> availabilityOfProducts = new HashMap<>();

    public boolean isAvailable(Product product){ return availabilityOfProducts.get(product); }

    public void addToList(Product product, Boolean availability){
        availabilityOfProducts.put(product, availability);
    }

    public void deleteFromList(Product product){ availabilityOfProducts.remove(product); }

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
