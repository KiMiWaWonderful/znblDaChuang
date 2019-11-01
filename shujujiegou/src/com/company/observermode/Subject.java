package com.company.observermode;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<>();
    int state;

    void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }

    void attach(Observer observer){
        observers.add(observer);
    }
    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
}
