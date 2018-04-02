package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public static void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("Warsaw Chopin Airport", true);
        airportMap.put("La Guardia Airport", true);
        airportMap.put("International Paris Airport", true);
        airportMap.put("Schipol Airport", true);

        if (airportMap.containsKey(flight.getArrivalAirport()) && airportMap.containsKey(flight.getDepartureAirport())) {
            if (airportMap.get(flight.getArrivalAirport()) && airportMap.get(flight.getDepartureAirport())) {
                System.out.println("This flight exists");
            } else {
                System.out.println("This flight doesn't exists");
            }
        } throw new RouteNotFoundException("This airport doesn't exists");
    }

    public static void main(String[] args) {

        Flight flight001 = new Flight("Warsaw Chopin Airport", "La Guardia Airport");
        Flight flight002 = new Flight("Schipol Airport", "Warsaw Chopin Airport");
        Flight flight003 = new Flight("Schipol Airport", "La Guardia Airport");
        Flight flight004 = new Flight("La Guardia Airport", "International Paris Airport");
        Flight flight005 = new Flight("Schipol Airport", "Cracow International");

        try {
            findFlight(flight001);
            findFlight(flight002);
            findFlight(flight003);
            findFlight(flight004);
            findFlight(flight005);
        }catch (RouteNotFoundException e) {
            System.out.println("Program couldn't find one of searched airports");
        }
    }
}
