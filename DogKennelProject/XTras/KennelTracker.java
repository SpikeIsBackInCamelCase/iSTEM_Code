package XTras;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import DogPack.Dog;
import DogPack.DogPound;

public class KennelTracker {
    public static List<DogPound> dogPounds = new ArrayList<>();
    public static HashMap<String, Dog> dogList = new HashMap<>();
    public static void addDog(Dog dog){
        dogList.put(Dog.dogIndex + "", dog);
    }
    public static void addDogPound(DogPound pound){
        dogPounds.add(pound);
    }
}
