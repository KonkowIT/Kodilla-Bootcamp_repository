package com.kodilla.good.patterns.challenges;

import java.awt.*;
import java.util.ArrayList;

public class User {
    String name;
    String surname;
    String street;
    int buildingNumber;
    String city;
    String postNumber;

    public User(String name, String surname, String street, int buildingNumber, String city, String postNumber) {
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.postNumber = postNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostNumber() {
        return postNumber;
    }

    ArrayList<Integer> boughtProducts = new ArrayList<>();

    public void addToUserList(int numberOfOperation) {
        boughtProducts.add(numberOfOperation);
    }
}
