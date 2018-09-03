package myExecutor;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
       ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            results.add(executor.submit(new TaskWithResult(2)));
        }
        for (Future<String> fs:results
             ) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        //executor.submit(new TaskWithResult(2));
       // System.out.println(future.get());

    }
}

class TaskWithResult implements Callable<String>{
    private int id;
    public TaskWithResult(int i) {
        this.id = i;
    }

    @Override
    public String  call() {
        return "第一个实现Callable接口的类"+id;
    }
}

