package com.example.chapter21.exercise;

public class One {

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
        new Thread(new A()).start();
        new Thread(new B()).start();
        new Thread(new C()).start();
    }
}
