package com.pack;

public class classloader {
    public static void main(String[] args) {
        ClassLoader c=ClassLoader.getSystemClassLoader();
        ClassLoader a=ClassLoader.getPlatformClassLoader();
        System.out.println(c.getParent());
        System.out.println(a.getParent());




    }
}
