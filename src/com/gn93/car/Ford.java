package com.gn93.car;

public class Ford implements Car {

    public Ford(SteeringWheelPosition steeringWheel, String colour, int maxSpeed, FordModel model) {
        this.steeringWheelPosition = steeringWheel;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    private SteeringWheelPosition steeringWheelPosition;
    private String colour;
    private int maxSpeed;
    private FordModel model;

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public String getColour() {
        return colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public FordModel getModel() {
        return model;
    }


}
