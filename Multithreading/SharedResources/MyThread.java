package SharedResources;

public class MyThread extends Thread {
    Counter myCounter;
    public MyThread(Counter counter)
    {
        myCounter = counter;
    }

    public void run(){
        myCounter.increment();
    }

    public static void main(String[] args){
        Counter sharedCounter = new Counter();
        MyThread t1 = new MyThread(sharedCounter);
        MyThread t2 = new MyThread(sharedCounter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        sharedCounter.printSum(); //wont give 200000

    }
}
