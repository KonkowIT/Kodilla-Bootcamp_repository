package com.kodilla.good.patterns.flightSearch;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class SearchEngine {
    public void searching(String departureAirport, String arrivalAirport) {
        FlightDatabase flightDatabase = new FlightDatabase();
        Random generator = new Random();
        System.out.println("Searching flight " + departureAirport.toUpperCase() + " -> " + arrivalAirport.toUpperCase());
        if(departureAirport.equals(arrivalAirport)) {
            System.out.println("Departure airport must be different than arrival airport!");
            System.exit(0);
        } else {
            Airport airportArrival = new Airport(arrivalAirport);
            Airport airportDeparture = new Airport(departureAirport);
            Flight flightTested = new Flight(airportArrival, airportDeparture);
            List<Flight> flights = flightDatabase.flightSet.stream()
                    .filter(a -> a.equals(flightTested))
                    .collect(Collectors.toList());

            if (flights.size() == 0) {
                System.out.println("Searched flight doesn't exist. Do You want to search connecting flight?");
                Scanner yOrN = new Scanner(in);
                char answerScan = yOrN.next().trim().toLowerCase().charAt(0);
                while (answerScan != 'y' && answerScan != 'n') {
                    System.out.println("You need to enter your answer");
                    Scanner yOrN2 = new Scanner(in);
                    answerScan = yOrN2.next().trim().toLowerCase().charAt(0);
                }

                if (answerScan == 'y') {
                    Map<Flight, Flight> connectingFlights = new HashMap<>();
                    List<Flight> connectingFlightsDep = flightDatabase.flightSet.stream()
                            .filter(a -> (a.getDepartureAirport().getTown()).equals(departureAirport))
                            .collect(Collectors.toList());

                    List<Flight> connectingFlightsArr = flightDatabase.flightSet.stream()
                            .filter(a -> (a.getDepartureAirport()).equals(departureAirport))
                            .collect(Collectors.toList());

                    for (int n = 0; n < connectingFlightsDep.size(); n++) {
                        for (int i = 0; i < connectingFlightsArr.size() || i < connectingFlightsDep.size(); i++) {
                            if (connectingFlightsDep.get(n).getDepartureAirport()
                                    .equals(connectingFlightsArr.get(i).getArrivalAirport())) {
                                connectingFlights.put(connectingFlightsDep.get(n), connectingFlightsArr.get(i));
                            }
                        }
                    }

                    System.out.println("List of flights with connecting:");
                    for (int a = 0; a < connectingFlights.size(); a++) {
                        Set<Flight> keys = connectingFlights.keySet();
                        for (Flight key : keys) {
                            System.out.println(a + 1 + " flight: first flight: " + key.getDepartureAirport() + " -> "
                                    + key.getArrivalAirport() + ", second flight: "
                                    + connectingFlights.get(a).getDepartureAirport() + " ->"
                                    + connectingFlights.get(a).getArrivalAirport());
                        }
                    }

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
    }
}

