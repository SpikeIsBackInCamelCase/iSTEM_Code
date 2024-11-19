package BlackCat;

public class Fun {
    public static void blackCat(Cat[] cats){
        for (Cat cat : cats){
            if(cat.blackCat()){
                System.out.println("SPOOKY!!!!");
                return;
            }
        }
    }

    public static void main(String[] args){
        Cat[] kitters = {new Cat("white"), new Cat("black")};
        blackCat(kitters);
    }
}
