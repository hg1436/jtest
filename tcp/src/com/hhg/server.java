package com.hhg;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket so=new ServerSocket(10000);
        while(true) {
            Socket ac = so.accept();
            new  Thread(new ServerThread(ac)).start();
        }

    }
}
