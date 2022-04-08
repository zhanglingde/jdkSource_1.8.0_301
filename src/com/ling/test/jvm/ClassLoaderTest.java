package com.ling.test.jvm;

/**
 * ClassLoader源码
 *
 * 自定义类加载器，只需要重写 findClass 方法
 *
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 需要加载一个类，只需要调用 ClassLoader 的 loadClass 方法就可以
        // loadClass 方法加载硬盘上的类到内存
        Class clazz = ClassLoaderTest.class.getClassLoader().loadClass("com.ling.test.jvm.T002_ClassLoaderLevel");
        System.out.println(clazz.getName());

        //利用类加载器加载资源，参考坦克图片的加载
        //T005_LoadClassByHand.class.getClassLoader().getResourceAsStream("");
    }
}