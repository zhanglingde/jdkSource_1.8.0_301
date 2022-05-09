package com.ling.juc.nolock;

import lombok.Data;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Unsafe CAS 操作
 */
public class TestUnsafe {
    public static void main(String[] args) throws Exception {
        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Unsafe unsafe =(Unsafe) theUnsafe.get(null);

        System.out.println(unsafe);

        // 1. 获取成员变量的偏移量
        long idOffset = unsafe.objectFieldOffset(User.class.getDeclaredField("id"));
        long nameOffset = unsafe.objectFieldOffset(User.class.getDeclaredField("name"));

        User user = new User();
        System.out.println(user);
        // 2.执行 CAS 操作（使用 cas 方法替换成员变量的值）
        // 参数一：对象  参数2：成员变量的偏移量   参数3：原值    参数4：修改后的值
        unsafe.compareAndSwapInt(user, idOffset, 0, 1);
        unsafe.compareAndSwapObject(user, nameOffset, null, "张三");

        System.out.println(user);

    }
}

@Data
class User {
    volatile int id;
    volatile String name;
}
