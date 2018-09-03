package myThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class PaiXu {
    public static void main(String[] args) throws InterruptedException{
        /*thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();*/

        executor.submit(thread1);
        executor.submit(thread2);
        executor.submit(thread3);

    }

    static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("线程一的名字："+Thread.currentThread().getName());
        }
    });
    static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("线程二的名字："+Thread.currentThread().getName());
        }
    });
    static Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("线程三的名字："+Thread.currentThread().getName());
        }
    });

    static ExecutorService executor = Executors.newSingleThreadExecutor();
}
