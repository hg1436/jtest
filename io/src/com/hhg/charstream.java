package com.hhg;

import java.io.*;

public class charstream {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter bw=new OutputStreamWriter(new FileOutputStream("io\\test.txt"),"GBK");

        bw.write("fasdf");
        bw.close();

        InputStreamReader br=new InputStreamReader(new FileInputStream("io\\test.txt"),"GBK");
        char[] vh=new char[1024];
        int b;
        while((b=br.read(vh))!=-1){
            System.out.println(new String(vh));
        }
        br.close();
    }
}
