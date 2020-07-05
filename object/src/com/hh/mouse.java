package com.hh;

public class mouse implements usb  {

    @Override
    public void open() {
        System.out.println("鼠标开始连接");
    }

    @Override
    public void close() {
        System.out.println("鼠标连接关闭");
    }

    public  void func(int a) throws exc {
        if(a<100){
            throw new exc("数字太小");

        }else
        {
            System.out.println("没问题");
        }
    }
}
