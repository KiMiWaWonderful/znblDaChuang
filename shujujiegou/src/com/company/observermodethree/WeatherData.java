package com.company.observermodethree;


import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observers ;
    double temperature;
    double humidity;
    double pressure;

    void measurementChanged(){
        notifyObservers();
    }
    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    void setMeasurement(double temperature,double humidity,double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
