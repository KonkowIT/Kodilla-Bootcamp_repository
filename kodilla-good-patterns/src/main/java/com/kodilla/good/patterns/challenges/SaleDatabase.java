package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class SaleDatabase {

    Map<Integer, Product> saleDatabase = new HashMap<Integer, Product>();
    Integer counter = 1;

    public int addToDatabase(Product product) {
        saleDatabase.put(counter, product);
        counter++;
        return counter - 1;
    }

    public Product getFromDatabase(int counter) {
        return saleDatabase.get(counter);
    }

    public void deleteFromDatabase(int counter) {
        saleDatabase.remove(counter);
    }
}
