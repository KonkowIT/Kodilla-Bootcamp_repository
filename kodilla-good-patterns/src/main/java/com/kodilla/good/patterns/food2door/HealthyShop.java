package com.kodilla.good.patterns.food2door;

import java.util.Random;

public class HealthyShop implements ProcessInterface {
    @Override
    public void process() {
        User konrad = new User("Konrad", "Kowalski", "Marszałkowska 123, 02-120 Warszawa", 20);
        ProductDatabaseSample productDatabaseSample = new ProductDatabaseSample();
        Courier courier = new Courier();
        Random idGenerator = new Random();

        double price = productDatabaseSample.getProduct("Tomato");
        double wallet = konrad.getWallet();
        int ID = idGenerator.nextInt(10000);

        if (wallet - price >= 0) {
            System.out.println("Payment accepted");
        } else {
            System.out.println("Not enough money in Your wallet");
            System.exit(0);
        }

        System.out.println("Sending order no. " + ID + " to address: "+  courier.courierParcel(konrad));
    }
}
