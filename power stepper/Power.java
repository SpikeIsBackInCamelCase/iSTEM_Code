import java.util.Scanner;
public class Power{
    private static void p(String x) {
        System.out.println(x);
    }
    private static Scanner in= new Scanner(System.in);
    private static int power, counter, numberInit;
    private static long number;
    
    public static void main (String args[]){
        p("Enter a number");
        numberInit = in.nextInt();
        number = numberInit;
        p("Enter a power");
        power = in.nextInt();
        for (counter = 1; counter != power; counter++){
            number*=numberInit;
            p(number+"");
        }
    }
}