package com.gn93.car;

public class BMW implements Car {

    public BMW(SteeringWheelPosition steeringWheel, String colour, int maxSpeed, BMWModel model) {
        this.steeringWheelPosition = steeringWheel;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    private SteeringWheelPosition steeringWheelPosition;
    private String colour;
    private int maxSpeed;
    private BMWModel model;

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public String getColour() {
        return colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public BMWModel getModel() {
        return model;
    }
}
