package com.ghc;

public class student {
    //学号
    private int sid;
    //姓名
    private String name;
    //年龄
    private int age;
    //居住地
    private String addr;

    public student() {
    }

    public student(int sid, String name, int age, String addr) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


}
