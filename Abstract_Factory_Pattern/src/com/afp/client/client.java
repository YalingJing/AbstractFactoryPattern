package com.afp.client;

import com.afp.factory.ElectricalFactory;
import com.afp.product.AirCondition.AirCondition;
import com.afp.product.TV.TV;

public class client {
    public static void main(String []args){
        ElectricalFactory factory;
        AirCondition airCondition;
        TV tv;
        factory = (ElectricalFactory)XMLUtil.getBean();
        assert factory != null;
        airCondition = factory.createAirCondition();
        tv = factory.createTV();
        airCondition.display();
        tv.display();
    }
}
