package com.ling.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class FixedThreadPoolDemo {

    public static void main(String[] args) {
        // ExecutorService pool = Executors.newFixedThreadPool(2);
        // 自定义线程工厂，定义线程名称
        ExecutorService pool = Executors.newFixedThreadPool(3, new ThreadFactory() {
            private AtomicInteger t = new AtomicInteger(1);
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"mypool-t"+t.getAndIncrement());
            }
        });

        pool.execute(()->{
            log.debug("任务1");
        });
        pool.execute(()->{
            log.debug("任务2");
        });
        pool.execute(()->{
            log.debug("任务3");
        });
    }
}
