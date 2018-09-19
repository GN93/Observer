package com.gn93;

import com.gn93.car.*;

public class ContinentalFactory implements Factory {

    private SteeringWheelPosition steeringWheelPosition = SteeringWheelPosition.RIGHT;

    @Override
    public BMW buildBMW(BMWModel bmwModel) {
        switch (bmwModel){
            case E60:
                return new BMW(steeringWheelPosition, "GREY", 250, BMWModel.E60);
            case X5:
                return new BMW(steeringWheelPosition, "PURPLE", 250, BMWModel.X5);
            case X7:
                return new BMW(steeringWheelPosition, "YELLOW", 250, BMWModel.X5);
            default:
                throw new UnsupportedOperationException("Błędny model!");
        }
    }

    @Override
    public Ford buildFord(FordModel fordModel) {
        switch(fordModel){
            case CMAX:
                return new Ford(steeringWheelPosition, "BLACK",190,FordModel.CMAX);
            case F150:
                return new Ford(steeringWheelPosition, "RED",240,FordModel.F150);
            case Mustang:
                return new Ford(steeringWheelPosition, "BLUE",280,FordModel.Mustang);
            default:
                throw new UnsupportedOperationException("Błędny model!");
        }
    }
}
