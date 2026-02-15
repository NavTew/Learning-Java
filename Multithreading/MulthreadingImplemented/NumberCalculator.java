package MulthreadingImplemented;
import java.lang.Thread;

public class NumberCalculator extends Thread{

    @Override
    public void run(){
        long count = 0;
        for(int i = 0; i < 1000000; i++){
            if(i%10 == 7) count++;
        }
        System.out.println("Count of numbers with last digit 7: " + count);
    }


}
