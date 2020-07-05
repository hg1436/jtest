package com.hh;




public class keyboard  implements usb {
    @Override
    public void open() {

        System.out.println("键盘开始连接");
    }

    @Override
    public void close() {
        System.out.println("键盘断开连接");
    }
}
