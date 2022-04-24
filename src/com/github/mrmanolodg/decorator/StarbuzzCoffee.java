package com.github.mrmanolodg.decorator;

import com.github.mrmanolodg.decorator.beverages.Espresso;
import com.github.mrmanolodg.decorator.beverages.HouseBlend;
import com.github.mrmanolodg.decorator.condiments.Mocha;
import com.github.mrmanolodg.decorator.condiments.Soy;
import com.github.mrmanolodg.decorator.condiments.Whip;

/**
 * Example program that simulate the behavior of a Coffee Shop.
 * The main pupose is to demonstrate how the decorator pattern could be used in this case.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", " + beverage.cost() + "$");

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + ", " + beverage2.cost() + "$");

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + ", " + beverage3.cost() + "$");

    }
}
