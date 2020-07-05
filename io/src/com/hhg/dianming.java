package com.hhg;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dianming {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw =new BufferedWriter(new FileWriter("io\\test.txt"));
        String[] str={"洪城","春天","夏天","冬天","秋天","美丽"};
        for(String x:str){
            bw.write(x);
            bw.newLine();
        }
        bw.close();

        BufferedReader br=new BufferedReader(new FileReader("io\\test.txt"));
        ArrayList<String> ls=new ArrayList<String>();
        String line;
        while((line=br.readLine())!=null){
            ls.add(line);
        }
        br.close();

        int len=ls.size();
        Random r=new Random();
        String res=ls.get(r.nextInt(len));
        System.out.println("点名："+res);
    }


}
