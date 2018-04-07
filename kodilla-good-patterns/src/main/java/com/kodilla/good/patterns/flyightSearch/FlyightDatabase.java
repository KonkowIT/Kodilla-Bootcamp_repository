package com.kodilla.good.patterns.flyightSearch;

import java.util.HashMap;
import java.util.Map;

class FlightDatabase {
    public static Map<Airport, Airport> flightMap = new HashMap<>();
    static {
        Airport warsaw = new Airport("Warsaw");
        Airport cracow = new Airport("Cracow");
        Airport wroclaw = new Airport("Wroclaw");
        Airport gdansk = new Airport("Gdansk");
        Airport poznan = new Airport("Poznan");

        flightMap.put(warsaw, cracow);
        flightMap.put(warsaw, wroclaw);
        flightMap.put(warsaw, gdansk);
        flightMap.put(warsaw, poznan);

        flightMap.put(cracow, warsaw);
        flightMap.put(cracow, wroclaw);
        flightMap.put(cracow, gdansk);

        flightMap.put(wroclaw, cracow);
        flightMap.put(wroclaw, warsaw);
        flightMap.put(wroclaw, poznan);

        flightMap.put(gdansk, cracow);
        flightMap.put(gdansk, warsaw);
        flightMap.put(gdansk, wroclaw);

        flightMap.put(poznan, warsaw);
        flightMap.put(poznan, cracow);
        flightMap.put(poznan, gdansk);
    }

    public Map<Airport, Airport> getFlightMap(){
        return flightMap;
    }
}
