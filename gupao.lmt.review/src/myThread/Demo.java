package myThread;

public class Demo{
    public static void main(String[] args) {
        System.out.println("主线程"+Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        thread1.setName("A");
        thread1.start();
        Thread thread2 = new Thread(myThread);
        thread2.setName("B");
        thread2.start();
        Thread t = new Thread();
        Thread.currentThread().getName();

    }
}

class MyThread implements Runnable{
    Double money = 5000.00;
    @Override
    public synchronized void run() {
            this.updateMoney(200.00);
    }

    public void updateMoney(Double d){
        synchronized (this){
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    money = money - d;
                    System.out.println(Thread.currentThread().getName() + "取钱取完钱，还剩" + money);
                    if (i==2)
                        wait();
                    if (i==1)
                        notify();
                    if (i==4)
                        notify();
                }
            }catch (Exception e){
                System.out.println("出现异常");
            }
        }
    }
}
