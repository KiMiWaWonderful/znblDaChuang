package com.example.chapter21.instance;

import java.util.concurrent.Callable;

public class TaskWithResults implements Callable<String>{
    private int id;

    public TaskWithResults(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResults" + id;
    }
}
