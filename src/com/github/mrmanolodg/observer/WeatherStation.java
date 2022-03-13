package com.github.mrmanolodg.observer;

/**
 * Example program that simulate the behavior of a weather stations.
 * The main purpose is to demonstrate how the observer patter could be used in this case
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,50,20);
        weatherData.setMeasurements(82,70,22.3f);
        weatherData.setMeasurements(60,30,25.2f);
    }
}
