package test;

import com.lmt.MyThread;

public class MyThreadTest {
    public static void main(String[] args) {
/*        MyThread myThread1 = new MyThread("A");
        MyThread myThread2 = new MyThread("B");
        MyThread myThread3 = new MyThread("C");
        MyThread myThread4 = new MyThread("D");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();*/

        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");

        a.start();
        b.start();
        c.start();


    }
}
