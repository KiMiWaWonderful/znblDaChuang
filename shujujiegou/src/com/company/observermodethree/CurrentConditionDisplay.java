package com.company.observermodethree;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    double temperature;
    double humidity;
    double pressure;
    Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current condition: temperature=" + temperature
                + ",humidity="+humidity+",pressure="+pressure);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
