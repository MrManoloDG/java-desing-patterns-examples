package com.github.mrmanolodg.observer;

import com.github.mrmanolodg.observer.interfaces.DisplayElement;
import com.github.mrmanolodg.observer.interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: \n" + "\t\033[1;32m temperature: " + temperature + "F \n"
                + "\t humidity: " + humidity + "%\n\t pressure: " + pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
