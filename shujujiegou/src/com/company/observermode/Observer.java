package com.company.observermode;

public abstract class Observer {
    Subject subject;
    abstract void update();
}
