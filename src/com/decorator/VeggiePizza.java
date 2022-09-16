package com.decorator;

public class VeggiePizza extends Pizza{


    @Override
    public String getDescription() {
        return "It' veggie pizza";
    }

    @Override
    public double getCost() {
        return 170.50;
    }
}
