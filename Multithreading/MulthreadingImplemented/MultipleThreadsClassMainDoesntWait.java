package MulthreadingImplemented;

public class MultipleThreadsClassMainDoesntWait {
    public static void main(String[] args){

        //approach 1 , in which main does not wait for the threads

        var startTime = System.currentTimeMillis();

        NumberCalculator t1 = new NumberCalculator(); //remember NumberCalculator extends Threads anyway
        //So it basically is a thread and will act accordingly

        SumCalculator sumCalculator = new SumCalculator();
        Thread t2 = new Thread(sumCalculator);


        t1.start();
        t2.start();

        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime)); //this gets printed
        //first too


    }
}
