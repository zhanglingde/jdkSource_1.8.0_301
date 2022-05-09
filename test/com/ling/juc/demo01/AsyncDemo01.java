package com.ling.juc.demo01;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangling
 * @date 2022/1/18 4:46 下午
 */
@Slf4j(topic = "c.AsyncDemo01")
public class AsyncDemo01 {

    public static void main(String[] args) {
        test01();
    }

    public static void test01() {
        // 进行计算的线程池
        ExecutorService computeService = Executors.newFixedThreadPool(2);
        // 接收结果的线程池
        ExecutorService resultService = Executors.newFixedThreadPool(1);
        log.debug("开始");
        // 任务一
        CompletableFuture.supplyAsync(() -> {
            log.debug("开始1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("结束1");
            return 10;
        }, computeService).thenAcceptAsync((result) -> {
            log.debug("结果为:{}", result);
        }, resultService);
        // 任务2
        CompletableFuture.supplyAsync(() -> {
            log.debug("开始2");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("结束2");
            return 10;
        }, computeService).thenAcceptAsync((result) -> {
            log.debug("结果为:{}", result);
        }, resultService);
        // 任务3
        CompletableFuture.supplyAsync(() -> {
            log.debug("开始3");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("结束3");
            return false;
        }, computeService).thenAcceptAsync((result) -> {
            if (!result) {
                log.debug("线程执行错误");
            }
            log.debug("结果为:{}", result);
        }, resultService);
        log.debug("结束");
    }


}
