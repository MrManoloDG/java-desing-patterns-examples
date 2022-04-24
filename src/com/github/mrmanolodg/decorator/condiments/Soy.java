package com.github.mrmanolodg.decorator.condiments;

import com.github.mrmanolodg.decorator.Beverage;
import com.github.mrmanolodg.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
