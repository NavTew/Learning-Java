package SharedResources;


public class SyncCounter{
    int sum;

    SyncCounter()
    {
        sum = 0;
    }

    public synchronized void increment(){ //synchronized added here prevents two or more thread
        //from accessing shared resources at the same time

        for(int i = 0; i < 100000; i++) //increased the workload to get the value
        {
            sum += 1;
        }

    }
    public void printSum(){
        System.out.println(sum);
    }

}



