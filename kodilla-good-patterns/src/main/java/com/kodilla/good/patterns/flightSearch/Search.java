package com.kodilla.good.patterns.flightSearch;

import java.util.Scanner;

import static java.lang.System.in;

public class Search {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();

        System.out.println("Please enter departure airport: ");
        Scanner departure = new Scanner(in);
        String departureAirport = departure.next().toLowerCase();
        System.out.println("Please enter arrival airport: ");
        Scanner arrival = new Scanner(in);
        String arrivalAirport = arrival.next().toLowerCase();
        searchEngine.searching(departureAirport, arrivalAirport);

    }
}
