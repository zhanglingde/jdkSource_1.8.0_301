package com.ling.juc.nolock;

import sun.misc.Unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangling  2021/8/21 20:49
 */
public class TestUnsafe_Account {
    public static void main(String[] args) {
        MyAtomicIntegerAccount.test(new MyAtomicIntegerAccount(10000));
    }
}

class MyAtomicIntegerAccount implements Account {
    private AtomicData balance;

    public MyAtomicIntegerAccount(int balance) {
        this.balance = new AtomicData(balance);
    }

    @Override
    public Integer getBalance() {
        return balance.getValue();
    }

    @Override
    public void withDraw(Integer amount) {
        balance.decrement(amount);
    }

    public static void test(MyAtomicIntegerAccount account) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            threads.add(new Thread(() -> {
                account.withDraw(10);
            }));
        }
        threads.forEach(Thread::start);
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(account.getBalance());
    }


}

class AtomicData {
    private volatile int value;
    private static final long valueOffset;
    static final Unsafe UNSAFE;

    public AtomicData(int value) {
        this.value = value;
    }

    static {
        UNSAFE = UnsafeAccessor.getUnsafe();
        try {
            // value 属性在 DataContainer 对象中的偏移量，用于 Unsafe 直接访问该属性
            valueOffset = UNSAFE.objectFieldOffset(AtomicData.class.getDeclaredField("value"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public int getValue() {
        return value;
    }

    // 扣减
    public void decrement(int amount) {
        int oldValue;
        while (true) {
            // 获取共享变量旧值，可以在这一行加入断点，修改 value 调试来加深理解
            oldValue = this.value;
            int newValue = oldValue - amount;
            // CAS 尝试修改 oldValue 为 newValue，如果旧值被其他线程修改了，返回 false
            if (UNSAFE.compareAndSwapInt(this, valueOffset, oldValue, newValue)) {
                break;
            }
        }

    }
}
