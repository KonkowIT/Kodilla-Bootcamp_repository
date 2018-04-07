package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabaseSample {
    public Map <String, Double> productDatabase = new HashMap<>();

    private void putToDatabase() {
        productDatabase.put("Tomato", 2.99);
        productDatabase.put("Potato", 1.99);
        productDatabase.put("Cerial", 6.99);
        productDatabase.put("Ham", 5.99);
        productDatabase.put("Cheese", 4.99);
        productDatabase.put("Ketchup", 7.99);
    }
}
