package com.unitedcoder.classconcepts;

public class TestMultiThread {
    public static void main(String[] args) {
        MultiThreadDemo1 demo1=new MultiThreadDemo1("Hello 1");
        MultiThreadDemo1 demo2=new MultiThreadDemo1("Hello 2");
        MultiThreadDemo1 demo3=new MultiThreadDemo1("Hello 3");
        MultiThreadDemo1 demo4=new MultiThreadDemo1("Hello 4");

        Thread thread1=new Thread(demo1);
        Thread thread2=new Thread(demo2);
        Thread thread3=new Thread(demo3);
        Thread thread4=new Thread(demo4);

        //start the thread
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
