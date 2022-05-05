package com.ling.juc.threadPool;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class newScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        log.debug("start...");
        // 延时 1s 执行任务
        pool.schedule(()->{
            log.debug("task 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },1, TimeUnit.SECONDS);

        pool.schedule(()->{
            log.debug("task 2");
        },1, TimeUnit.SECONDS);

    }
}
