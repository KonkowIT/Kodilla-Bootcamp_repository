package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args){

        ProductDatabase productDatabase = new ProductDatabase();
        Product tshirt = new Product("White T-Shirt", 59);
        User konrad = new User("Konrad", "Kowalski", "Marszałkowska",32, "Warsaw", "02-120");
        SaleService saleService = new SaleService();
        Boolean availability = true;

        productDatabase.addToList(tshirt, availability);

        saleService.saleRequest(tshirt, konrad);
    }
}
