package com.example.chapter21.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Three {

    static class A implements Runnable{
        @Override
        public void run() {
            try {
                for (int i = 0; i <3 ; i++) {
                    System.out.println("A run");
                    Thread.yield();
                }
                System.out.println("A run complete");
                // Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public A() {
            System.out.println("Construct A");
        }
    }

    static class B implements Runnable{
        @Override
        public void run() {
            try {
                for (int i = 0; i <3 ; i++) {
                    System.out.println("B run");
                    Thread.yield();
                }
                System.out.println("B run complete");
                // Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public B() {
            System.out.println("Construct B");
        }
    }

    static class C implements Runnable{
        @Override
        public void run() {
            try {
                for (int i = 0; i <3 ; i++) {
                    System.out.println("C run");
                    Thread.yield();
                }
                System.out.println("C run complete");
                // Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public C() {
            System.out.println("Construct C");
        }
    }

    public static void main(String[] args) {
      //  System.out.println("newCachedThreadPool");
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Thread(new A()));
        executorService.execute(new Thread(new B()));
        executorService.execute(new Thread(new C()));
        executorService.shutdown();

       // System.out.println("newFixedThreadPool");
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        executorService1.execute(new Thread(new A()));
        executorService1.execute(new Thread(new B()));
        executorService1.execute(new Thread(new C()));
        executorService1.shutdown();

        //System.out.println("newSingleThreadExecutor");
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService2.execute(new Thread(new A()));
        executorService2.execute(new Thread(new B()));
        executorService2.execute(new Thread(new C()));
        executorService2.shutdown();
    }
}
