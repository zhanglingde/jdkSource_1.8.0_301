package com.ling.io;

import java.io.*;
import java.util.zip.ZipOutputStream;

/**
 * @author zhangling
 * @date 2022/3/2 11:23 上午
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        testBufferedOutputStream();
        testBufferedInputStream();
    }

    public static void testBufferedOutputStream() {
        try {
            File file = new File("buffer.txt");
            // 嵌套过滤器添加多种功能
            DataOutputStream dos = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)));

            dos.writeUTF("hello");
            dos.writeUTF("何当共剪西窗烛");
            dos.writeUTF("却话巴山夜雨时");

            dos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testBufferedOutputStream2() {
        try {
            File file = new File("buffer.txt");
            // 嵌套过滤器添加多种功能
            ZipOutputStream zip = new ZipOutputStream(
                    new DataOutputStream(
                        new BufferedOutputStream(
                            new FileOutputStream(file))));

            // zip.writeUTF("hello");
            // zip.writeUTF("何当共剪西窗烛");
            // zip.writeUTF("却话巴山夜雨时");
            //
            // dos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testBufferedInputStream() {
        try {
            File file = new File("buffer.txt");
            DataInputStream dis = new DataInputStream(
                    new FileInputStream(file));

            System.out.println("dis.readUTF() = " + dis.readUTF());
            System.out.println("dis.readUTF() = " + dis.readUTF());
            System.out.println("dis.readUTF() = " + dis.readUTF());

            dis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
