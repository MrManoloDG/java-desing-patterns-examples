package com.github.mrmanolodg.decorator.condiments;

import com.github.mrmanolodg.decorator.Beverage;
import com.github.mrmanolodg.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .05;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
