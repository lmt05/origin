package maven_springboot;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public boolean find(int[] data,int sum){
        List<int[]> ints = Arrays.asList(data);

        return false;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("I'm "+Thread.currentThread().getName());
                    }
                }).start();
            }else {
                new Thread(()->{
                    System.out.println("I'm   ...."+Thread.currentThread().getName());
                }).start();
            }
        }
    }
}
