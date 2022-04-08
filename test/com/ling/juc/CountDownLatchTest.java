package com.ling.juc;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhangling
 * @date 2022/3/15 7:37 下午
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            latch.countDown();
        }, "t1").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            latch.countDown();
        }, "t2").start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
