package com.company.observermode;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    void update() {
        System.out.println("OctalObserver" + Integer.toOctalString(subject.getState()));
    }
}
