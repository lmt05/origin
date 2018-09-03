package programmingQuestion;

public class SubjectRunnable implements Runnable {

    private int threadid ;
    private static volatile int count = 0;
    private Object o;

    public SubjectRunnable(int threadid,Object o){
        this.threadid = threadid;
        this.o = o;
    }

    @Override
    public void run() {
        while (count<75){
            synchronized (o){
                if(count/5%3+1==threadid){
                    for (int i = 0; i < 5; i++) {
                        count++;
                        System.out.println("线程"+threadid +":  "+ count);
                        o.notifyAll();
                    }
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
