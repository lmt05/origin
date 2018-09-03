package myThread;

public class Test {
    public static void main(String[] args) {
        MyTestThread mtt = new MyTestThread();
        Thread t = new Thread(mtt);
        t.start();
    }
}

class MyTestThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("练习1");
            Thread.yield();
        }
    }
}
