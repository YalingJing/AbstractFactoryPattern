package com.afp.factory;

import com.afp.product.AirCondition.AirCondition;
import com.afp.product.TV.TV;

public interface ElectricalFactory {
    AirCondition createAirCondition();
    TV createTV();
}
