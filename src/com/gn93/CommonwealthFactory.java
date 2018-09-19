package com.gn93;

import com.gn93.car.*;

public class CommonwealthFactory implements Factory {

    private SteeringWheelPosition steeringWheelPosition = SteeringWheelPosition.LEFT;

    @Override
    public BMW buildBMW(BMWModel bmwModel) {
        switch (bmwModel){
            case E60:
                return new BMW(steeringWheelPosition, "GREEN", 250, BMWModel.E60);
            case X5:
                return new BMW(steeringWheelPosition, "PURPLE", 250, BMWModel.X5);
            case X7:
                return new BMW(steeringWheelPosition, "WHITE", 250, BMWModel.X5);
            default:
                throw new UnsupportedOperationException("Unknown model!");
        }
    }

    @Override
    public Ford buildFord(FordModel fordModel) {
        switch(fordModel){
            case CMAX:
                return new Ford(steeringWheelPosition, "BROWN",190,FordModel.CMAX);
            case F150:
                return new Ford(steeringWheelPosition, "SILVER",240,FordModel.F150);
            case Mustang:
                return new Ford(steeringWheelPosition, "BLUE",280,FordModel.Mustang);
            default:
                throw new UnsupportedOperationException("Unknown model!");
        }
    }

}
