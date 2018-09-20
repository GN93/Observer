package com.gn93.car;

public abstract class Car {

    private SteeringWheelPosition steeringWheelPosition;
    private String colour;
    private int maxSpeed;
    private int productionYear;

    protected Car(SteeringWheelPosition steeringWheelPosition, String colour, int maxSpeed, int productionYear) {
        this.steeringWheelPosition = steeringWheelPosition;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.productionYear = productionYear;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
