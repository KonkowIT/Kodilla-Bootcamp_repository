package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args){

        ProductDatabase productDatabase = new ProductDatabase();
        SaleDatabase saleDatabase = new SaleDatabase();
        ShipmentService shipmentService = new ShipmentService(saleDatabase);
        User konrad = new User("Konrad", "Kowalski", "Marszałkowska",32, "Warsaw", "02-120");
        SaleService saleService = new SaleService(productDatabase, saleDatabase, shipmentService);

        saleService.saleRequest(new Product("Blue tshirt", 59), konrad);
    }
}
