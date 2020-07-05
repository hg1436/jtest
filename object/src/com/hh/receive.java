package com.hh;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10086);

        byte[] by=new byte[1024];
        DatagramPacket dp=new DatagramPacket(by,by.length);
        ds.receive(dp);
        byte[] data = dp.getData();
        System.out.println("数据是"+new String(data,0,dp.getLength()));
        ds.close();
    }
}
