package com.ling.jvm.classloader;

/**
 * 自定义类加载器，只需要重写 findClass 方法
 */
public class T002_ClassLoaderLevel {
    public static void main(String[] args) {
        // 返回 null 表示用的是 BootstrapClassLoader
        System.out.println(String.class.getClassLoader());
        System.out.println(sun.awt.HKSCS.class.getClassLoader());
        // ExtClassLoader（扩展类加载器）
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
        // AppClassLoader（加载 classpath 包下的类）
        System.out.println(T002_ClassLoaderLevel.class.getClassLoader());

        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader().getClass().getClassLoader());
        System.out.println(T002_ClassLoaderLevel.class.getClassLoader().getClass().getClassLoader());

        //System.out.println(new T006_MSBClassLoader().getParent());
        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
