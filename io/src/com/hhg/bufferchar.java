package com.hhg;

import java.io.*;

public class bufferchar {
    public static void main(String[] args) throws IOException {
        FileWriter t=new FileWriter("io\\test.txt");
        BufferedWriter bw=new BufferedWriter(t);
        for(int i=0;i<10;i++){
            bw.write("hello");
            bw.newLine();
        }
        bw.close();

        FileReader f=new FileReader("io\\test.txt");
        BufferedReader br=new BufferedReader(f);

        String st;
        while((st=br.readLine())!=null){
            System.out.println(st);
        }
        br.close();
    }
}
