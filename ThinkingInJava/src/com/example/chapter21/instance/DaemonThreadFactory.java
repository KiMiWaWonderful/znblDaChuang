package com.example.chapter21.instance;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}
