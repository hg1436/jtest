package com.pack;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class arr {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arr=new ArrayList<>();

        Class<? extends ArrayList> hhg = arr.getClass();
        Method ad = hhg.getMethod("add", Object.class);
        ad.invoke(arr,"efe");
        ad.invoke(arr,"fdf");
        System.out.println(arr);
    }
}
