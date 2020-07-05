package com.hhg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class arraychar {
    public static void main(String[] args) throws IOException {
        List<String> ls=new ArrayList<String>();
        ls.add("daf");
        ls.add("ffff");
        ls.add("dffff");

        BufferedWriter bw=new BufferedWriter(new FileWriter("io\\test.txt"));
        for(String x:ls){
            bw.write(x);
            bw.newLine();
        }
        bw.close();
    }
}
