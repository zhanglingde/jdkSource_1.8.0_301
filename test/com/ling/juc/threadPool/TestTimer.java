package com.ling.juc.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 在『任务调度线程池』功能加入之前，可以使用 java.util.Timer 来实现定时功能，Timer 的优点在于简单易用，但
 * 由于所有任务都是由同一个线程来调度，因此所有任务都是串行执行的，同一时间只能有一个任务在执行，前一个
 * 任务的延迟或异常都将会影响到之后的任务。
 */
@Slf4j
public class TestTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task1 = new TimerTask(){
            @Override
            public void run() {
                log.debug("task 1");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        TimerTask task2 = new TimerTask(){
            @Override
            public void run() {
                log.debug("task 2");
            }
        };
        log.debug("start...");
        timer.schedule(task1,1000);
        // 任务2等 任务1 执行完后才开始执行
        timer.schedule(task2,1000);
    }
}
