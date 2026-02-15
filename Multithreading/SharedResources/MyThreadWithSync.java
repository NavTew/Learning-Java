package SharedResources;

public class MyThreadWithSync extends Thread {
    SyncCounter mySyncCounter;
    public MyThreadWithSync(SyncCounter SyncCounter)
    {
        mySyncCounter = SyncCounter;
    }

    public void run(){
        mySyncCounter.increment();
    }

    public static void main(String[] args){
        SyncCounter sharedSyncCounter = new SyncCounter();
        MyThreadWithSync t1 = new MyThreadWithSync(sharedSyncCounter);
        MyThreadWithSync t2 = new MyThreadWithSync(sharedSyncCounter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        sharedSyncCounter.printSum(); //wont give 200000

    }
}
