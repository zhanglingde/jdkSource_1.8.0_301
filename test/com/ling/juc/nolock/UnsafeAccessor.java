package com.ling.juc.nolock;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 获取 Unsafe 对象：Unsafe 对象提供了非常底层的，操作内存、线程的方法，Unsafe 对象不能直接调用，只能通过反射获得
 */
public class UnsafeAccessor {
    static Unsafe unsafe;

    static {
        try {
            // 获取 Unsafe 对象实例
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            // 允许访问私有
            theUnsafe.setAccessible(true);
            unsafe = (Unsafe) theUnsafe.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new Error(e);
        }
    }

    static Unsafe getUnsafe(){
        return unsafe;
    }

}
