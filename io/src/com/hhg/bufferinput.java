package com.hhg;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class bufferinput {
    public static void main(String[] args) throws IOException {
        BufferedInputStream br=new BufferedInputStream(new FileInputStream("io\\test.txt"));
        byte[] by=new byte[1024];
        int len;
        while((len=br.read(by))!=-1){
            System.out.println(new String(by,0,len));
        }
        br.close();
    }
}
