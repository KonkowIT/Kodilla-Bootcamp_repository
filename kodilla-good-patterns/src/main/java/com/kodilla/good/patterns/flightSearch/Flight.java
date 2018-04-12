package com.kodilla.good.patterns.flightSearch;

public class Flight {
    private Airport arrivalAirport;
    private Airport departureAirport;

    public Flight(Airport arrivalAirport, Airport departureAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }
}
