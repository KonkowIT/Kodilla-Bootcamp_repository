package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Dao.ProductDao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product apple = new Product("apple");
        Product lemon= new Product("lemon");
        Product watermelon = new Product("watermelon");
        Product cheese = new Product("cheese");
        Product tomato = new Product("tomato");

        Invoice invoice = new Invoice("No. 1");

        Item item1 = new Item(apple, new BigDecimal(5), 2);
        Item item2 = new Item(lemon, new BigDecimal(7), 4);
        Item item3 = new Item(watermelon, new BigDecimal(15), 1);
        Item item4 = new Item(cheese, new BigDecimal(33), 1);
        Item item5 = new Item(tomato, new BigDecimal(4), 7);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);
    }
}
