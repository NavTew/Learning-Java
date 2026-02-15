package SharedResources;


public class Counter{
    int sum;

    Counter()
    {
        sum = 0;
    }

    public void increment(){

        for(int i = 0; i < 100000; i++) //increased the workload to get the value
        {
            sum += 1;
        }

    }
    public void printSum(){
        System.out.println(sum);
    }

}



