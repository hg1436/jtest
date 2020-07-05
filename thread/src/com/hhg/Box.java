package com.hhg;

import org.w3c.dom.ls.LSOutput;

public class Box {
    private int milk;
    private boolean fg=false;
    public synchronized void put(int a){
        if(fg){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk=a;
        System.out.println("增加了"+a+"瓶牛奶");
        fg=true;
        notifyAll();
    }
    public synchronized void get(){
        if(!fg){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("现在有"+milk+"瓶牛奶");
        fg=false;
        notifyAll();
    }

}
