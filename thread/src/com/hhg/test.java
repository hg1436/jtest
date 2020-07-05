package com.hhg;

public class test {
    public static void main(String[] args) {
        Box b=new Box();
        Producer pro=new Producer(b);
        Customer cus=new Customer(b);

        Thread t1=new Thread(pro);
        Thread t2=new Thread(cus);

        t1.start();
        t2.start();
    }
}
