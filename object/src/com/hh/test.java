package com.hh;


import com.pack.inter;
import com.pack.student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.*;

public class test {

    public static void main(String[] args) throws exc, IOException {

        new Thread(()->{
            System.out.println("asdfl");
        }).start();
//模块依赖
//        student stu=new student();
//        stu.fun2();
        ServiceLoader<inter> yy= ServiceLoader.load(inter.class);
        for(inter x:yy){
            x.func();
        }
    }
}
