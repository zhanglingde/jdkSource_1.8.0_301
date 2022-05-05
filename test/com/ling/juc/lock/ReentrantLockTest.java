package com.ling.juc.lock;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock 加锁查看
 * @author zhangling  2021/9/4 10:31
 */
@Slf4j
public class ReentrantLockTest {
    private static ReentrantLock lock = new ReentrantLock();

    public static void m1(){
        // 调用 Sync.lock()
        log.info("lock...");
        lock.lock();
        try{
            System.out.println("hello");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        m1();

    }
}
