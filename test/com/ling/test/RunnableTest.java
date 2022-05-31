package com.ling.test;

/**
 * @author zhangling
 * @date 2022/5/16 10:11 上午
 */
public class RunnableTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {


            }
        }).start();
    }
}
