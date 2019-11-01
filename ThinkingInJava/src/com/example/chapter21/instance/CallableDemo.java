package com.example.chapter21.instance;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();

        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new TaskWithResults(i)));
        }

        for (Future<String> future:results) {
            System.out.println(future.get());
        }
    }
}
