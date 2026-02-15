package MainThreadOnly;

public class MainThreadOnlyClass {

    public static void main(String[] args){

        var startTime = System.currentTimeMillis();

        long sum = 0;
        for(int i = 0; i < 5000000; i++) {
            sum += i;

        }
        System.out.println("Sum of all numbers: " + sum);

        long count = 0;
        for(int i = 0; i < 1000000; i++){
            if(i%10 == 7) count++;
        }
        System.out.println("Count of numbers with last digit 7: " + count);

        System.out.println(System.currentTimeMillis()-startTime);
    }
}
