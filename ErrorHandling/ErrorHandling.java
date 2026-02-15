public class ErrorHandling {
    public static void main(String[] args) {
        //Exceptions help the flow of the
        //program to keep going
        //So use a try catch block

        //if i do 10/0 it will give me a runtime error
        //what i can do instead :

        try{
            int result = 10/0;
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e);
        } finally {
            System.out.println("Execution continues");
        }

        System.out.println("Execution ends");


    }
}
