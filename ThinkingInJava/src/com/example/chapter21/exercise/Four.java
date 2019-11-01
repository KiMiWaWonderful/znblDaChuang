package com.example.chapter21.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Four {

    static class FibA implements Runnable{
        private int n = 0;

        public FibA(int n) {
            this.n = n;
        }

        private int fib(int x){
            if(x<2){
                return 1;
            }
            return fib(x-2)+fib(x-1);
        }

        @Override
        public void run() {
            for (int i = 0; i < n; i++) {
                System.out.print("A"+fib(i) +" ");
            }
            System.out.println();
        }
    }

    static class FibB implements Runnable{
        private int n = 0;

        public FibB(int n) {
            this.n = n;
        }

        private int fib(int x){
            if(x<2){
                return 1;
            }
            return fib(x-2)+fib(x-1);
        }

        @Override
        public void run() {
            for (int i = 0; i < n; i++) {
                System.out.print("B"+fib(i) +" ");
            }
            System.out.println();
        }
    }

    static class FibC implements Runnable{
        private int n = 0;

        public FibC(int n) {
            this.n = n;
        }

        private int fib(int x){
            if(x<2){
                return 1;
            }
            return fib(x-2)+fib(x-1);
        }

        @Override
        public void run() {
            for (int i = 0; i < n; i++) {
                System.out.print("C"+fib(i) +" ");
            }
            System.out.println();
        }
    }

    static class FibD implements Runnable{
        private int n = 0;

        public FibD(int n) {
            this.n = n;
        }

        private int fib(int x){
            if(x<2){
                return 1;
            }
            return fib(x-2)+fib(x-1);
        }

        @Override
        public void run() {
            for (int i = 0; i < n; i++) {
                System.out.print("D"+fib(i) +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Thread(new FibA(15)));
        executorService.execute(new Thread(new FibB(15)));
        executorService.execute(new Thread(new FibC(15)));
        executorService.execute(new Thread(new FibD(15)));
        executorService.shutdown();

        // System.out.println("newFixedThreadPool");
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        executorService1.execute(new Thread(new FibA(15)));
        executorService1.execute(new Thread(new FibB(15)));
        executorService1.execute(new Thread(new FibC(15)));
        executorService1.execute(new Thread(new FibD(15)));
        executorService1.shutdown();

        //System.out.println("newSingleThreadExecutor");
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService2.execute(new Thread(new FibA(15)));
        executorService2.execute(new Thread(new FibB(15)));
        executorService2.execute(new Thread(new FibC(15)));
        executorService2.execute(new Thread(new FibD(15)));
        executorService2.shutdown();
    }
}
