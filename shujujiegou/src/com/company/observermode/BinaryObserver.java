package com.company.observermode;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("BinaryObserver"+Integer.toBinaryString(subject.getState()));

    }
}
