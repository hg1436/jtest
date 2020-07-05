package com.hhg;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private  Socket ac;
    public ServerThread(Socket ac) {
    this.ac=ac;
    }

    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(ac.getInputStream()));

            int count=0;
            File ff=new File("tcp\\test"+count+".txt");
            while(ff.exists()){
                count++;
                ff=new File("tcp\\test"+count+".txt");
            }
            BufferedWriter bw=new BufferedWriter(new FileWriter(ff));
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            BufferedWriter ww=new BufferedWriter(new OutputStreamWriter(ac.getOutputStream()));
            ww.write("上传成功");
            ww.newLine();
            ww.flush();

            bw.close();
            ac.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
