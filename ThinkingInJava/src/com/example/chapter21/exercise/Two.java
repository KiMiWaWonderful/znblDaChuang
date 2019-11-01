package com.example.chapter21.exercise;

public class Two {
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

        new Thread(new FibA(15)).start();
        new Thread(new FibB(15)).start();
        new Thread(new FibC(15)).start();
        new Thread(new FibD(15)).start();
    }
}
