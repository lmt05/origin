package programmingQuestion;

import com.lmt.MyRunnable;

public class Subject1 {

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
/*        new Thread(new PrintRunnable(1,o)).start();
        new Thread(new PrintRunnable(2,o)).start();
        new Thread(new PrintRunnable(3,o)).start();*/
        new Thread(new MyRunnable(1,o)).start();
        new Thread(new MyRunnable(2,o)).start();
        new Thread(new MyRunnable(3,o)).start();
    }
/*    static class PrintRunnable implements Runnable {

        private static volatile int printNum = 0;
        private int threadId;
        private Object o;
        public PrintRunnable(int threadId,Object o){
            this.threadId = threadId;
            this.o=o;
        }
        @Override
        public void run() {
            while(printNum < 75){
                synchronized (o){
                    if (printNum/5%3 + 1 == threadId){
                        //该判断确保对应线程输出
                        for (int i = 0; i <5; i++) {
                            System.out.println("线程"+threadId+":"+(++printNum));
                        }
                        o.notifyAll();
                    }else {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
    }*/

    static class MyRunnable implements  Runnable{
        private int threadid;
        private static volatile int count = 0;
        private Object o;

        public MyRunnable (int threadid,Object o){
            this.threadid = threadid;
            this.o = o;
        }

        @Override
        public void run() {
            while (count<75){
                synchronized (o){
                    System.out.println("拿到锁："+Thread.currentThread().getName());
                    if(count/5%3+1==threadid){
                        for (int i = 0; i < 5; i++) {
                            count++;
                            System.out.println("线程"+threadid+":"+count);
                        }
                        o.notifyAll();
                    }else {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}