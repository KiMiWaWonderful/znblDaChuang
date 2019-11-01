package com.example.chapter21.instance;

public class SimpleDaemons implements Runnable{

    @Override
    public void run() {
        try {
            while (true){
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() +" ," + this);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SimpleDaemons());
            thread.setDaemon(true);
            thread.start();
        }
        System.out.println("all daemons thread start");
        Thread.sleep(1000);
    }
}
