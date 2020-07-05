package com.pack;

public class student {
    private String name;
    public String add;
    private int age;

    public student() {
    }

    private student(String name) {
        this.name = name;
    }

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public student(String name, String add, int age) {
        this.name = name;
        this.add = add;
        this.age = age;
    }


    //四个成员方法
    private void fun1(){
        System.out.println("method1");
    }
    public void fun2(){
        System.out.println("methond2");
    }
    public   void fun3(String s){
        System.out.println("method"+s);

    }
    public   String fun4(String a,int b){
        return a+','+b;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", age=" + age +
                '}';
    }
}
