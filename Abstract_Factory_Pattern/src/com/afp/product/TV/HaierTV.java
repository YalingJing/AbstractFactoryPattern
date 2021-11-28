package com.afp.product.TV;

public class HaierTV implements TV{

    public HaierTV(){}

    @Override
    public void display() {
        System.out.println("生产海尔电视机");
    }
}
