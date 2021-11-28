package com.afp.factory;

import com.afp.product.AirCondition.AirCondition;
import com.afp.product.AirCondition.TCLAirCondition;
import com.afp.product.TV.TCLTV;
import com.afp.product.TV.TV;

public class TCLFactory implements ElectricalFactory{
    public TCLFactory(){}

    @Override
    public AirCondition createAirCondition() {
        return new TCLAirCondition();
    }

    @Override
    public TV createTV() {
        return new TCLTV();
    }
}
