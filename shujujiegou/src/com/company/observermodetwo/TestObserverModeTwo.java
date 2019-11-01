package com.company.observermodetwo;

public class TestObserverModeTwo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        System.out.println("first...");
        currentConditionDisplay.display();

        weatherData.setMeasurement(0.00,1.00,2.00);
        System.out.println("second...");
        currentConditionDisplay.display();
    }
}
