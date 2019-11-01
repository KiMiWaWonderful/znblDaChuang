package com.company.observermodetwo;

import java.util.Observable;

public class WeatherData extends Observable{

    double temperature;
    double humidity;
    double pressure;

    void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    void setMeasurement(double temperature,double humidity,double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
    public WeatherData() {
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
