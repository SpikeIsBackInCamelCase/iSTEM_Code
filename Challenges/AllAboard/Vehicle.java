package AllAboard;
public class Vehicle {

    public static void allAboard(Rider[] riders){
        int checker = 0;
        for(Rider rider : riders){
            checker+=(rider.onBoard)?1:0;
        }
        if (checker == riders.length) System.out.println("All aboard!");
        if (checker != riders.length) System.out.println("bro dey aint aboard broski");
    }
}
