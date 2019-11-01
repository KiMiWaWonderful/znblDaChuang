package com.example.chapter21.instance;

import java.util.concurrent.*;

public class DaemonThreadPoolExecutor extends ThreadPoolExecutor{

    public DaemonThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                    BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new DaemonThreadFactory());
    }

//    public DaemonThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime,
//                                    TimeUnit unit, BlockingQueue<Runnable> workQueue) {
//        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, workQueue);
//    }
}
