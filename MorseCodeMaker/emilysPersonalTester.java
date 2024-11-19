import java.util.Scanner;
public class emilysPersonalTester {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to turn into morse code");
        Emily emilyDo = new Emily(input.nextLine());
        System.out.print(emilyDo.set() + "\n" + emilyDo.returnLength());
        input.close();
    }
}
