package com.gn93;

public class Main {

    public static void main(String[] args) {

        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50.0).build();
        System.out.println(flightLeg);

    }
}
