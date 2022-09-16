package com.decorator;
public abstract class PizzaDecorator extends Pizza{

    Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public abstract  String getDescription() ;

    @Override
    public abstract double getCost();
}
