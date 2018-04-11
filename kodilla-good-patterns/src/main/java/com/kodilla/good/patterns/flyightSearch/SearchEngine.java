package com.kodilla.good.patterns.flyightSearch;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class SearchEngine {
    public void searching(String derpartureAirport, String arrivalAirport) {
        FlightDatabase flightDatabase = new FlightDatabase();
        Random generator = new Random();

        if(!derpartureAirport.equals(arrivalAirport)) {
            Airport airportArrival = new Airport(arrivalAirport);
            Airport airportDeparture = new Airport(derpartureAirport);
            Flight flightTested = new Flight(airportArrival, airportDeparture);
            Flight flights = flightDatabase.flightSet.contains(flightTested).stream()
                    .anyMatch(setOut(Flight));
            //otrzymujemy jeden wynik (lot)

            if (flights == null) {
                System.out.println("Searched flight doesn't exist. Do You want to search connecting flight?");
                Scanner yOrN = new Scanner(in);
                char answerScan = yOrN.next().trim().toLowerCase().charAt(0);
                while(answerScan != 'y' && answerScan != 'n'){
                    System.out.println("You need to enter your answer");
                    Scanner yOrN2 = new Scanner(in);
                    answerScan = yOrN2.next().trim().toLowerCase().charAt(0);
                }

                if (answerScan == 'y') {
                    //wyszukiwanie lotów z przesiadką

                } else {
                    System.out.println("Ok :( Bye");
                    System.exit(0);
                }

            } else {
                int hoursDecimal = generator.nextInt(3);
                int hoursUnits = generator.nextInt(10);
                int minutesDecimal = generator.nextInt(60);
                int minutesUnits = generator.nextInt(60);
                String time = hoursDecimal + hoursUnits + ":" + minutesDecimal + minutesUnits;
                int flightNumber = generator.nextInt(100000);
                System.out.println("Searched flight departure time: " + time + "flight number: " + flightNumber);
            }
        }
        System.out.println("Departure airport must be different than arrival airport!");

    }
}

