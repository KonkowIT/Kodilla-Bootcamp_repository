package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ExtraFoodShop implements ProcessInterface {
    @Override
    public void process() {
        User konrad = new User("Adam", "Czarny", "Cyrkowa 123, 02-120 Kraków", 20);
        ProductDatabaseSample productDatabaseSample = new ProductDatabaseSample();
        Courier courier = new Courier();
        Random idGenerator = new Random();

        List<Double> boughtProductsList = new ArrayList<>();
        boughtProductsList.add(productDatabaseSample.getProduct("Tomato"));
        boughtProductsList.add(productDatabaseSample.getProduct("Potato"));
        boughtProductsList.add(productDatabaseSample.getProduct("Cerial"));
        boughtProductsList.add(productDatabaseSample.getProduct("Cheese"));
        boughtProductsList.add(productDatabaseSample.getProduct("Ham"));

        double wallet = konrad.getWallet();
        int ID = idGenerator.nextInt(10000);
        double price = boughtProductsList.stream()
                .collect(Collectors.counting());
        System.out.println("Final price is " + price);
        if (wallet - price >= 0) {
            System.out.println("Payment accepted");
        } else {
            System.out.println("Not enough money in Your wallet");
            System.exit(0);
        }

        System.out.println("Sending order no. " + ID + " to address: "+  courier.courierParcel(konrad));
    }
}
