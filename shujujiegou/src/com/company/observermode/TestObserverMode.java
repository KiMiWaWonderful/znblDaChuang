package com.company.observermode;

public class TestObserverMode {

    public static void main(String[] args) {
        Subject subject = new Subject();
        //subject = new

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexObserver hexObserver = new HexObserver(subject);

        subject.setState(10);
        subject.setState(15);
    }
}
