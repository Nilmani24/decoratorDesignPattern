package com.decorator;

public class SoyaDecorator extends PizzaDecorator{
    public SoyaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " ,add soya to pizza";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30.0;
    }
}
