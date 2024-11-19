package AllAboard;

public class Tester {
    public static void main(String[] args) {
        Rider[] riders = new Rider[2];
        riders[0] = new Rider(false);
        riders[1] = new Rider(true);
        Vehicle.allAboard(riders);
        riders[0].onBoard = true;
        Vehicle.allAboard(riders);
    }
}
