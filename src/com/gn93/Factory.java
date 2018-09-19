package com.gn93;

import com.gn93.car.*;

public interface Factory {

    BMW buildBMW(BMWModel bmwModel);
    Ford buildFord(FordModel fordModel);

}
