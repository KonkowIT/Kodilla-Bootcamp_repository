package com.kodilla.good.patterns.flightSearch;

import java.util.HashSet;
import java.util.Set;

class FlightDatabase {
    public static Set<Flight> flightSet = new HashSet<Flight>();
    static {
        Airport warsaw = new Airport("Warsaw");
        Airport cracow = new Airport("Cracow");
        Airport wroclaw = new Airport("Wroclaw");
        Airport gdansk = new Airport("Gdansk");
        Airport poznan = new Airport("Poznan");

        Flight flight001 = new Flight(warsaw, cracow);
        Flight flight002 = new Flight(warsaw, wroclaw);
        Flight flight003 = new Flight(warsaw, gdansk);
        Flight flight004 = new Flight(warsaw, poznan);
        Flight flight010 = new Flight(cracow, warsaw);
        Flight flight011 = new Flight(cracow, wroclaw);
        Flight flight012 = new Flight(cracow, gdansk);
        Flight flight020 = new Flight(wroclaw, cracow);
        Flight flight021 = new Flight(wroclaw, warsaw);
        Flight flight022 = new Flight(wroclaw, poznan);
        Flight flight030 = new Flight(gdansk, cracow);
        Flight flight031 = new Flight(gdansk, warsaw);
        Flight flight032 = new Flight(gdansk, wroclaw);
        Flight flight040 = new Flight(poznan, warsaw);
        Flight flight041 = new Flight(poznan, cracow);
        Flight flight042 = new Flight(poznan, gdansk);

        flightSet.add(flight001);
        flightSet.add(flight002);
        flightSet.add(flight003);
        flightSet.add(flight004);
        flightSet.add(flight010);
        flightSet.add(flight011);
        flightSet.add(flight012);
        flightSet.add(flight020);
        flightSet.add(flight021);
        flightSet.add(flight022);
        flightSet.add(flight030);
        flightSet.add(flight031);
        flightSet.add(flight032);
        flightSet.add(flight040);
        flightSet.add(flight041);
        flightSet.add(flight042);
    }
}
