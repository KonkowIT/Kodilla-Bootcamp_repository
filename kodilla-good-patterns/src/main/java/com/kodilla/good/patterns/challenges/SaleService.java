package com.kodilla.good.patterns.challenges;

public class SaleService {

    private ProductDatabase productDatabase;
    private SaleDatabase saleDatabase;
    private ShipmentService shipmentService;

    public SaleService(ProductDatabase productDatabase, SaleDatabase saleDatabase, ShipmentService shipmentService) {
        this.productDatabase = productDatabase;
        this.saleDatabase = saleDatabase;
        this.shipmentService = shipmentService;
    }

    public void saleRequest(Product product, User user){
        if (productDatabase.isAvailable(product)){
            System.out.println("Product is available, processing to sale");
            int numberOfOperation = saleDatabase.addToDatabase(product);
            user.addToUserList(numberOfOperation);
            shipmentService.shippingProduct(user);

        } else { System.out.println("Product is not available!"); }
    }

}
