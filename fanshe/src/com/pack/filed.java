package com.pack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class filed {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> stu = Class.forName("com.pack.student");
//        Field[] fd = stu.getFields();
//        for(Field x:fd){
//            System.out.println(x);
//        }
//        Field[] fd = stu.getDeclaredFields();
//        for(Field x:fd){
//            System.out.println(x);
//        }
        Field ad = stu.getField("add");
        Constructor<?> con = stu.getConstructor();
        Object obj=con.newInstance();
        System.out.println(obj);
        ad.set(obj,"xian");//给obj的成员变量add赋值xian


        Field name = stu.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj,"ghc");
        //System.out.println(obj);

        Field age = stu.getDeclaredField("age");
        age.setAccessible(true);
        age.set(obj,33);
        System.out.println(obj);

    }
}
