package com.ghc;

import java.lang.reflect.Array;
import java.util.*;

public class maneger {
    public static void main(String[] args) {

        List<student> arr=new ArrayList<student>();


        while(true) {
            System.out.println("------------欢迎来到学生管理系统-----------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择；");

            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    //System.out.println("添加学生");
                    addstudeny(arr);
                    break;
                case 2:
                    //System.out.println("删除学生");
                    remo(arr);
                    break;
                case 3:
                    //System.out.println("修改学生");
                    chan(arr);
                    break;
                case 4:
                    //System.out.println("查看所有学生");
                    findstudent(arr);
                    break;
                case 5:
                    System.out.println("退出");
                    //break;

                default:
                    System.out.println("错误代码");
                    System.exit(0);


            }
        }




    }


    public static void addstudeny(List<student> arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学号：");
        int sid=sc.nextInt();
        while(true) {
            int fg=0;
            for (student x : arr) {
                if (x.getSid() == sid) {
                    fg=1;
                    break;

                }
            }
            if(fg==1){
                System.out.println("学号已经存在，请重新输入：");
                sid = sc.nextInt();
            }else break;
        }
        System.out.println("请输入姓名：");
        String name=sc.next();
        System.out.println("请输入年龄:");
        int age=sc.nextInt();
        System.out.println("请输入居住地：");
        String addr=sc.next();

        student ghc=new student();
        ghc.setSid(sid);
        ghc.setName(name);
        ghc.setAge(age);
        ghc.setAddr(addr);

        arr.add(ghc);
        System.out.println("添加成功");

    }

    public static void remo(List<student> arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除人的学号：");
        int sid=sc.nextInt();
        int fg=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getSid()==sid){
                arr.remove(i);
                System.out.println("删除成功！");
                fg=1;
                break;
            }
        }
        if(fg==0) System.out.println("查无此人！");

    }

    public static void chan(List<student> arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要修改人的学号：");
        int fg=0;
        int sid=sc.nextInt();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getSid()==sid){
                System.out.println("输入新的姓名：");
                String name =sc.next();
                arr.get(i).setName(name);
                System.out.println("请输入新的年龄：");
                int  age=sc.nextInt();
                arr.get(i).setAge(age);
                System.out.println("输入新的居住地址：");
                String addr=sc.next();
                arr.get(i).setAddr(addr);
                System.out.println("修改成功！");
                break;
            }
        }
        if(fg==0) System.out.println("查无此人！");
    }

    public static void findstudent(List<student> arr) {
        if (arr.size() == 0) {
            System.out.println("无信息！");
            return;
        }

            System.out.println("学号\t姓名\t年龄\t居住地");
            for (int i = 0; i < arr.size(); i++) {
                student s = arr.get(i);
                System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getAddr());

            }

    }
}
