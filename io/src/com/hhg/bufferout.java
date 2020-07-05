package com.hhg;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferout {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bw=new BufferedOutputStream(new FileOutputStream("io\\test.txt"));
    bw.write("dfa\r\n".getBytes());
    bw.write("fas".getBytes());
    bw.write("hhg\n".getBytes());
    bw.close();
    }
}
