package com.kodilla.good.patterns.food2door;

public class User {
    private String name;
    private String surname;
    private String address;
    private double wallet;

    public User(String name, String surname, String address, double wallet) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public double getWallet() {
        return wallet;
    }
}
