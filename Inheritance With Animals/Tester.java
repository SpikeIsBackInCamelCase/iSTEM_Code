public class Tester {
    public static void main(String[] args) {
        Rozak r1 = new Rozak(new Genius(3, 169, "Cornell"), "Island School", 69);
        Rozak r2 = new Rozak(new Genius(3, 169, "Cornell"), "Island School", 69);
        Rozak r3 = new Rozak(new Genius(3, 170, "Cornell"), "Island School", 69);
        Genius g = new Genius(r3);
        System.out.println(r1.equals(r3));//false
        System.out.println(r1.equals(r2));//true
        System.out.println(r3.equals(g));//true
    }
}
