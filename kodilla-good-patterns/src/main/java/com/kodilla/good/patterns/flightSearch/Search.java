package com.kodilla.good.patterns.flightSearch;

import java.util.Scanner;

import static java.lang.System.in;

public class Search {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();

        System.out.println("Please enter departure airport:\n(warsaw, gdansk, poznan, wroclaw, cracow)");
        Scanner departure = new Scanner(in);
        String departureAirport = departure.next().trim().toLowerCase();
        if (departureAirport.equals("poznan") ||
                departureAirport.equals("wroclaw") ||
                departureAirport.equals("cracow") ||
                departureAirport.equals("warsaw") ||
                departureAirport.equals("gdansk")) {

            System.out.println("Please enter arrival airport:\n(warsaw, gdansk, poznan, wroclaw, cracow)");
            Scanner arrival = new Scanner(in);
            String arrivalAirport = arrival.next().trim().toLowerCase();
            if (arrivalAirport.equals("poznan") ||
                    arrivalAirport.equals("wroclaw") ||
                    arrivalAirport.equals("cracow") ||
                    arrivalAirport.equals("warsaw") ||
                    arrivalAirport.equals("gdansk")) {

                searchEngine.searching(departureAirport, arrivalAirport);
            } else {
                System.out.println("Input correct airport (warsaw, gdansk, poznan, wroclaw, cracow)");
                System.exit(0);
            }
        } else {
            System.out.println("Input correct airport (warsaw, gdansk, poznan, wroclaw, cracow)");
            System.exit(0);
        }
    }
}
