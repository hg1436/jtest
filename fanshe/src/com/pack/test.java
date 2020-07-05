package com.pack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Properties pro=new Properties();
        FileReader br=new FileReader("fanshe\\test.txt");
        pro.load(br);
        br.close();
        String cc=pro.getProperty("className");
        String c2=pro.getProperty("method");

        Class<?> aa = Class.forName(cc);
        Constructor<?> con = aa.getConstructor();
        Object obj=con.newInstance();
        Method mm=aa.getMethod(c2);
        mm.invoke(obj);
    }
}
