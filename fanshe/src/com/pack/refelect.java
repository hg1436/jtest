package com.pack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class refelect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //三种获取反射的方式
//        Class<student> st = student.class;
//        System.out.println(st);
//        Class<student> st2 = student.class;
//        System.out.println(st==st2);
//
//        student s=new student();
//        Class<? extends student> ss = s.getClass();
//        System.out.println(ss==st);
//
//        Class<?> a = Class.forName("com.pack.student");
//        System.out.println(a==ss);
        //Class<?> stu = Class.forName("com.pack.student");
        Class<student> stu = student.class;
      //  Constructor<?>[] con = stu.getConstructors();
//        Constructor<?>[] con = stu.getDeclaredConstructors();
//        for(Constructor<?> x:con){
//            System.out.println(x);
//        }
        Constructor<student> con = stu.getConstructor(String.class,String.class,int.class);
        Object obj=con.newInstance("ghc","pc",22);
        System.out.println(obj);

        Constructor<student> con1 = stu.getDeclaredConstructor(String.class);
        //访问私有的要强制
        con1.setAccessible(true);
        student hh = con1.newInstance("kkj");
        System.out.println(hh);

    }
}
