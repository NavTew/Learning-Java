package MulthreadingImplemented;
import java.lang.Runnable;

public class SumCalculator implements Runnable {

    @Override
    public void run(){
        long sum = 0;
        for(int i = 0; i < 5000000; i++) {
            sum += i;

        }
        System.out.println("Sum of all numbers: " + sum);
    }
}
