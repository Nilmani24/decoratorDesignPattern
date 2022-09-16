package com.decorator;

public class PaneerPizza extends Pizza{
    @Override
    public String getDescription() {
        return "It's panner pizza";
    }

    @Override
    public double getCost() {
        return 100.50;
    }
}
