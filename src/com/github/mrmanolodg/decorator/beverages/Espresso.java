package com.github.mrmanolodg.decorator.beverages;

import com.github.mrmanolodg.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
