package myThread;

public class DaemonThread {
    public static void main(String[] args) {
        Runnable tdt = new TestDaemonThread();
        Thread t1= new Thread(tdt);
        Thread t2= new UserThread();
        //t1.setDaemon(true);
        //t1.setName("A");
        //t2.start();
        System.out.println(Thread.currentThread().getName());
    }
}

class TestDaemonThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("守护线程第"+i+"次执行");
            try{
                System.out.println(Thread.currentThread().getName()
                        +"....."+Thread.currentThread().isAlive());
                Thread.sleep(100);
                //System.out.println(thread.isAlive());

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class UserThread extends Thread{
    public UserThread(){
        this.start();
        System.out.println("UserThread线程构造this.getName是"+this.getName());
        System.out.println("UserThread线程构造Thread.currentThread().getName()是"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        //System.out.println("UserThread线程this.getName是"+this.getName());
        //System.out.println("UserThread线程Thread.currentThread().getName()是"+Thread.currentThread().getName());
       for (int i = 0; i <20 ; i++) {
            System.out.println("用户线程第"+i+"次执行");
            try {
                Thread.sleep(100);
                System.out.println(this.getName());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

