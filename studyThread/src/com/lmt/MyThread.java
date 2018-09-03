package com.lmt;

public class MyThread extends Thread {

    private static volatile int count = 5;

/*    public MyThread (String name){
        this.setName(name);
    }*/

    public synchronized void run() {
        while (count>0){
            count--;
            System.out.println("由"+MyThread.currentThread().getName()+"计算，count="+count);
        }
    }
}
