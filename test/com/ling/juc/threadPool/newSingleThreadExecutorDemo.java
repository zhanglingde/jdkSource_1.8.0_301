package com.ling.juc.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class newSingleThreadExecutorDemo {
    public static void main(String[] args) {
        // 所有线程池是从 ExecutorServer 继承的，Executors 是对线程池的工厂
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            final int j = i;
            service.execute(() -> {
                log.debug("j:{}", j);
                // System.out.println(j + " " + Thread.currentThread().getName());
            });
        }

    }
}
