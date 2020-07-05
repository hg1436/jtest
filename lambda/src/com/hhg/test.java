package com.hhg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {



//        fun((int a,int b)->{
//            return a+b;
//
//        });
//        fun1((String ss)->{
////            //System.out.println(ss);
////            System.out.println("自定义");
////        });
        //lamada必须是街路口，而且接口只有一个方法；
        fun1(s-> System.out.println("自定义"));
        fun((a,b)->a+b);
        //方法引用符号  ：：
        fun1(System.out::println);
        new Thread(()-> System.out.println("县城开始")).start();
//        string str=(String ss)-> System.out.println(ss);
//        str.eat("dfdw");
       // fun2(()-> System.out.println("df"));
        thd(()-> System.out.println("fdsfkk"));
        ArrayList<String > arr=new ArrayList<>();
        arr.add("dfau");
        arr.add("dfh");
        arr.add("adf");
        //Collections.sort(arr,com());
        Collections.sort(arr,(s1,s2)->s1.length()-s2.length());
        for(String x:arr) System.out.println(x);

    }
    public static void fun(jie e){
        int sum=e.sum(1,2);
        System.out.println(sum);
    }
    public static void fun1(string e){
        e.eat("唉生化");
    }
    public static  void fun2(wu ss){
        ss.ff();
    }
    //函数接口作为参数
    public static void thd(Runnable run){
        new Thread(run).start();
    }
//函数接口作为返回值
    public static Comparator<String> com(){
//       return new Comparator<String>() {
//           @Override
//           public int compare(String o1, String o2) {
//               //return o1.length()-o2.length();
//               return o1.compareTo(o2);
//           }
//       };
        //return (s1,s2)->s1.length()-s2.length();
        return (s1,s2)->s1.compareTo(s2);

    }
}
