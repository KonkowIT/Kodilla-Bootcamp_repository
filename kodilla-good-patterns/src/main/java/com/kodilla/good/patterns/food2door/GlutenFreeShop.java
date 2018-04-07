package com.kodilla.good.patterns.food2door;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class GlutenFreeShop implements ProcessInterface {
    @Override
    public void process() {
        User konrad = new User("Tomek", "Nowak", "Al. Jerozolimskie 12, 02-130 Warszawa", 30);
        ProductDatabaseSample productDatabaseSample = new ProductDatabaseSample();
        Courier courier = new Courier();
        Random idGenerator = new Random();

        double price = productDatabaseSample.getProduct("Tomato");
        System.out.println("There is a Tomato in your basket.");
        double wallet = konrad.getWallet();
        int ID = idGenerator.nextInt(10000);

        System.out.println("Do You want to add something else to your order?");
        Scanner yOrN = new Scanner(in);
        char answerScan = yOrN.next().trim().toLowerCase().charAt(0);
        while (answerScan == 'y' ||
                answerScan == 'n') {
            if(answerScan == 'y') {
                double price2 = productDatabaseSample.getProduct("Potato");
                System.out.println("You added a Potato to your basket.");
                double priceAll = price + price2;
                System.out.println("Final price of Your products is " + priceAll);
                if (wallet - priceAll >= 0) {
                    System.out.println("Payment accepted");
                } else {
                    System.out.println("Not enough money in Your wallet");
                }

                System.out.println("Sending order no. " + ID + " to address: " + courier.courierParcel(konrad));
            } else {
                if (wallet - price >= 0) {
                    System.out.println("Final price of Your products is " + price);
                    System.out.println("Payment accepted");
                } else {
                    System.out.println("Not enough money in Your wallet");
                }


                System.out.println("Sending order no. " + ID + " to address: " + courier.courierParcel(konrad));
            }
            answerScan = 'z';
        }
    }
}
