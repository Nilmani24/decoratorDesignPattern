package com.decorator;

public class SauceDecorator extends PizzaDecorator{
    public SauceDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ " ,add sauce to pizza";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5.5;
    }
}
