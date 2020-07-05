package com.hhg;

import java.io.*;

public class copyvideo {
    public static void main(String[] args) throws IOException {
        long st=System.currentTimeMillis();
        func();
        long end=System.currentTimeMillis();

        System.out.println("消耗时间为"+(end-st));


    }
    public static void func() throws IOException {

        FileInputStream fin=new FileInputStream("C:\\steam\\1\\steamapps\\common\\wallpaper_engine\\projects\\defaultprojects\\dino_run\\preview.gif");
        FileOutputStream fout=new FileOutputStream("io\\test1.gif");
        byte[] by=new byte[1024];
        int len;
        while((len=fin.read(by))!=-1){
            fout.write(by,0,len);
        }
        fin.close();
        fout.close();

    }
    public static void func1() throws IOException {

        FileInputStream fin=new FileInputStream("C:\\steam\\1\\steamapps\\common\\wallpaper_engine\\projects\\defaultprojects\\dino_run\\preview.gif");
        FileOutputStream fout=new FileOutputStream("io\\test1.gif");
        BufferedInputStream br=new BufferedInputStream(fin);
        BufferedOutputStream bw=new BufferedOutputStream(fout);


        byte[] by=new byte[1024];
        int len;
        while((len=br.read(by))!=-1){
            bw.write(by,0,len);
        }
        fin.close();
        fout.close();

    }
}
