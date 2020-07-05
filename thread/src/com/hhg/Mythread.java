package com.hhg;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mythread implements Runnable {
    private static int tick=50;
    private Object ob=new Object();
    private int x=0;
    private Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while(tick>0) {

                lock.lock();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "还有" + tick + "张票");
                    tick--;
                lock.unlock();

        }
    }

    public static synchronized  void func(){
        if(tick>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "还有" + tick + "张票");
            tick--;

        }
    }
}
