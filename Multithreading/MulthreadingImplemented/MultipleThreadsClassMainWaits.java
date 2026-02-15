package MulthreadingImplemented;

public class MultipleThreadsClassMainWaits {
    public static void main(String[] args){
        //approach 2 , in which main waits for the threads

        var startTime = System.currentTimeMillis();

        NumberCalculator t1 = new NumberCalculator(); //remember NumberCalculator extends Threads anyway
        //So it basically is a thread and will act accordingly
        SumCalculator sumCalculator = new SumCalculator();
        Thread t2 = new Thread(sumCalculator);

        //why did SumCalculator an object first ?
        //because we were using implements interface Runnable
        //Now Runnable does not directly have a .start() method .
        //So we had to make a thread t2 containing the object
        //The object does have the run() inside it so I think the thread
        //knows where to start execution from

        //Now we have two thread objects , we can use .start() which belongs to thread class
        //Thread class is public so we can easily use .start()


        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){
            throw new RuntimeException(e); //look at this carefully
            //the way you have to throw the e
        }


        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime));
    }
}
