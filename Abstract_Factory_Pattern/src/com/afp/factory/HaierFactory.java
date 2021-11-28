package com.afp.factory;

import com.afp.product.AirCondition.AirCondition;
import com.afp.product.AirCondition.HaierAirCondition;
import com.afp.product.TV.HaierTV;
import com.afp.product.TV.TV;

public class HaierFactory implements ElectricalFactory{
    public HaierFactory(){}

    @Override
    public AirCondition createAirCondition() {
        return new HaierAirCondition();
    }

    @Override
    public TV createTV() {
        return new HaierTV();
    }
}
