package com.example.chapter21.instance;

public class BasicThreads {
    public static void main(String[] args) {
       // new Thread(new LiftOff(10)).start();
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff(10)).start();
        }
    }
}
