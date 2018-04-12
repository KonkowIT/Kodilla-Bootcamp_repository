package com.kodilla.good.patterns.flightSearch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchEngine {
    public void searchFrom(Airport airport) {
        List<Flight> flights = FlightDatabase.flightSet.stream()
                .filter(a -> a.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());

        for (Flight flight : flights){
            System.out.println("Flight from: " + flight.getDepartureAirport().getTown().toUpperCase() +
                    " to " + flight.getArrivalAirport().getTown().toUpperCase());
        }

    }

    public void searchTo(Airport airport) {
        List<Flight> flights = FlightDatabase.flightSet.stream()
                .filter(a -> a.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());

        for (Flight flight : flights){
            System.out.println("Flight from: " + flight.getDepartureAirport().getTown().toUpperCase() +
            " to " + flight.getArrivalAirport().getTown().toUpperCase());
        }

    }

    public void searchBetween(Airport airportDep, Airport airportArr) {
        Map<Flight, Flight> connectingFlights = new HashMap<>();
        List<Flight> connectingFlightsDep = FlightDatabase.flightSet.stream()
                .filter(a -> (a.getDepartureAirport()).equals(airportDep))
                .collect(Collectors.toList());

        List<Flight> connectingFlightsArr = FlightDatabase.flightSet.stream()
                .filter(a -> (a.getDepartureAirport()).equals(airportArr))
                .collect(Collectors.toList());

        for (int n = 0; n < connectingFlightsDep.size(); n++) {
            for (int i = 0; i < connectingFlightsArr.size() || i < connectingFlightsDep.size(); i++) {
                if (connectingFlightsDep.get(n).getDepartureAirport()
                        .equals(connectingFlightsArr.get(i).getArrivalAirport())) {
                    connectingFlights.put(connectingFlightsDep.get(n), connectingFlightsArr.get(i));
                }
            }
        }
    }
}