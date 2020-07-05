package com.hhg;

import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket so = new Socket("HONGCHENG", 10000);
        BufferedReader br = new BufferedReader(new FileReader("tcp\\test.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {

            bw.write(line);
            bw.newLine();
            bw.flush();


        }
        so.shutdownOutput();

        BufferedReader rr=new BufferedReader(new InputStreamReader(so.getInputStream()));
        String tem=rr.readLine();
        System.out.println("服务器："+tem);

        br.close();
        so.close();
    }

}
