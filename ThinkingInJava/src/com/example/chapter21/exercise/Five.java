package com.example.chapter21.exercise;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Five {
    static class FibA implements Callable<Integer>{

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
        public Integer call() throws Exception {
            int result = 0;
            for (int i = 0; i < n; i++) {
                result = result + fib(i);
            }
            return (Integer)result;
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();

        for (int i = 0; i < 15; i++) {
            results.add(executorService.submit(new FibA(i)));
        }


            try {
                for (Future<Integer> future:results) {
                    System.out.println(future.get());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
            executorService.shutdown();
            }

    }
}
