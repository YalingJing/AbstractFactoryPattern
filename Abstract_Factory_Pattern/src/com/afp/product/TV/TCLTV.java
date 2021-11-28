package com.afp.product.TV;

public class TCLTV implements TV{

    public TCLTV(){}

    @Override
    public void display() {
        System.out.println("生产TCL电视机");
    }
}

