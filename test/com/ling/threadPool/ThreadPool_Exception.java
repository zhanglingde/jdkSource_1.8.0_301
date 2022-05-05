package com.ling.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 线程池异常处理
 */
@Slf4j
public class ThreadPool_Exception {
    public static void main(String[] args) {

        // exceptionHandle1();

        exceptionHandle2();
    }

    /**
     * 线程池内部处理
     */
    private static void exceptionHandle1() {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        ThreadPool_Exception h = new ThreadPool_Exception();
        for (int i = 0; i < 10; i++) {
            pool.execute(() -> {
                try {
                    h.handle();
                } catch (Exception e) {
                    log.error(e.getMessage());
                }
            });
        }
    }

    /**
     * future 处理异常
     */
    private static void exceptionHandle2() {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        ThreadPool_Exception h = new ThreadPool_Exception();
        List<String> errors = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            try {
                Future<?> future = pool.submit(() -> {
                    h.handle();
                });
                future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {  // 在内部异常上包装了一层 ExecutionException 异常
                Throwable cause = e.getCause();
                if (cause instanceof ArithmeticException) {
                    errors.add(cause.getMessage());
                }
            }
        }
        log.error("errors：{}", errors);
    }

    public void handle() {
        log.debug("handle start ...");
        int j = 1 / 0;
    }
}
