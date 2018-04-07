package com.kodilla.good.patterns.food2door;

public class App {
    public static void main(String[] args) {
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        System.out.println("Healthy Shop");
        healthyShop.process();
        System.out.println("\nGluten Free Shop");
        glutenFreeShop.process();
        System.out.println("\nExtra Food Shop");
        extraFoodShop.process();
    }
}
