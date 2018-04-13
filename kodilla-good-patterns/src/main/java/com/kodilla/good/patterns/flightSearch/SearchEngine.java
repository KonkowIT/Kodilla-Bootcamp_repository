package com.kodilla.good.patterns.flightSearch;

import java.util.List;
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

    public void searchBetween(Airport airportThrough) {
        List<Flight> connectingFlightsDep = FlightDatabase.flightSet.stream()
                .filter(a -> (a.getArrivalAirport()).equals(airportThrough))
                .collect(Collectors.toList());

        List<Flight> connectingFlightsArr = FlightDatabase.flightSet.stream()
                .filter(a -> (a.getDepartureAirport()).equals(airportThrough))
                .collect(Collectors.toList());

        for (int n = 0; n < connectingFlightsDep.size(); n++) {
            System.out.println("1st flight: " + connectingFlightsDep.get(n).getDepartureAirport().getTown() + " -> "
                    + connectingFlightsDep.get(n).getArrivalAirport().getTown());
        }

        for (int n = 0; n < connectingFlightsArr.size(); n++) {
            System.out.println("2nd flight: " + connectingFlightsArr.get(n).getDepartureAirport().getTown() + " -> "
                    + connectingFlightsArr.get(n).getArrivalAirport().getTown());
        }
    }
}