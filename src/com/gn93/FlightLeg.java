package com.gn93;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed = false;
    private double price = 0;

    private FlightLeg (FlightLegBuilder flightLegBuilder){
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "FlightLeg{from='" + getFrom()
                    + "', to='" + getTo()
                    + "', price=" + getPrice()
                    + ", delayed=" + isDelayed()
                    + "}";
    }


    public static class FlightLegBuilder{
        String from = "";
        String to = "";
        boolean delayed = false;
        double price = 0;

        FlightLegBuilder (String from, String to){
            this.from = from;
            this.to = to;
        }

        FlightLegBuilder price (double price){
            this.price = price;
            return this;
        }

        FlightLeg build(){
            if (this.price == 0)
                throw new IllegalStateException ("Brak wymaganego pola - cena!");

            return new FlightLeg(this);
        }

    }


}
