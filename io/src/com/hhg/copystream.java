package com.hhg;

import java.io.*;

public class copystream {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("C:\\rj\\1\\sdfa.java"));
        PrintWriter pw=new PrintWriter(new FileWriter("io\\test.java"));
        String tem;
        while((tem=br.readLine())!=null){
            pw.println(tem);
        }
        br.close();
        pw.close();
    }
}
