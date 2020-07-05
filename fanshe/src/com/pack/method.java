package com.pack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class method {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> stu = Class.forName("com.pack.student");
//        Method[] me = stu.getMethods();
//        for(Method x:me) System.out.println(x);
//        Method[] me = stu.getDeclaredMethods();
//        for(Method x:me) System.out.println(x);
        Method fun2 = stu.getMethod("fun2");
        Constructor<?> con = stu.getConstructor();
        Object obj=con.newInstance();
        //Object invoke(Object obj,Object ... args)
        //Object 返回值类型  obj 调用方法的对象  args方法需要的参数
        fun2.invoke(obj);

        Method fun3 = stu.getMethod("fun3", String.class);
        fun3.invoke(obj,"ghc");

        Method fun4=stu.getMethod("fun4", String.class, int.class);
        System.out.println(fun4.invoke(obj,"hhg",22));

        Method fun1 = stu.getDeclaredMethod("fun1");
        fun1.setAccessible(true);
        fun1.invoke(obj);

    }
}
