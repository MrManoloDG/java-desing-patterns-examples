package com.github.mrmanolodg.decorator.beverages;

import com.github.mrmanolodg.decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
