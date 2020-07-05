package com.hhg;

import java.io.*;

public class copyfile {
    public static void main(String[] args) throws IOException {
        File src=new File("C:\\rj\\1");

        File des =new File("io");
        copyFolder(src,des);

    }
    private static void copyFolder(File src, File des) throws IOException {
        if(src.isDirectory()){
            String tem=src.getName();
            File newfol=new File(des,tem);
            if(!newfol.exists()) newfol.mkdir();
            File[] arr=src.listFiles();
            for(File x:arr){
                copyFolder(x,newfol);
            }
        }else{
            File newfile=new File(des,src.getName());
            copyFile(src,newfile);
        }

    }
    private static void copyFile(File x, File desfile) throws IOException{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(x));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(desfile));
        byte[] by=new byte[1024];
        int len;
        while((len=bis.read(by))!=-1){
            bos.write(by,0,len);
        }
        bis.close();
        bos.close();
    }

}
