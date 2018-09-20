package com.gn93;

import com.gn93.car.*;

public class CommonwealthFactory implements Factory {

    private SteeringWheelPosition steeringWheelPosition = SteeringWheelPosition.LEFT;

    @Override
    public BMW buildBMW(BMWModel bmwModel) {
        switch (bmwModel){
            case E60:
                return new BMW(steeringWheelPosition, "GREEN", 250, 2010);
            case X5:
                return new BMW(steeringWheelPosition, "PURPLE", 250, 2012);
            case X7:
                return new BMW(steeringWheelPosition, "WHITE", 250, 2015);
            default:
                throw new UnsupportedOperationException("Unknown model!");
        }
    }

    @Override
    public Ford buildFord(FordModel fordModel) {
        switch(fordModel){
            case CMAX:
                return new Ford(steeringWheelPosition, "BROWN",190,2017);
            case F150:
                return new Ford(steeringWheelPosition, "SILVER",240,2016);
            case Mustang:
                return new Ford(steeringWheelPosition, "BLUE",280,2018);
            default:
                throw new UnsupportedOperationException("Unknown model!");
        }
    }

}
