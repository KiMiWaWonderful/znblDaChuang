package com.company.observermode;

public class HexObserver extends Observer{
    @Override
    void update() {
        System.out.println("HexObserver" + Integer.toHexString(this.subject.getState()));
    }

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
}
