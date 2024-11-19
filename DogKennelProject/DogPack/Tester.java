package DogPack;
public class Tester {
    public static void main(String[] args){
        Dog dog1 = new Dog(true, "Buddy", (byte) 3);
        Dog dog2 = new Dog(false, "Sadie", (byte) 5);
        Dog dog3 = new Dog(true, "Max", (byte) 2);
        Dog dog4 = new Dog(false, "Lucy", (byte) 4);
        Dog dog5 = new Dog(true, "Charlie", (byte) 1);
        Dog dog6 = new Dog(false, "Molly", (byte) 6);
        Dog dog7 = new Dog(true, "Rocky", (byte) 3);
        DogPound pound1 = new DogPound("Mr. Rose's kennel for dogs of special needs");
        DogPound pound2 = new DogPound("Mr. Rose's puppy mill");

        pound1.addDog(dog1);
        DogPound.adoptDog(dog1);
        DogPound.adoptDog(dog7);
        pound1.addDog(dog2);
        pound1.addDog(dog3);
        pound1.addDog(dog4);
        pound1.addDog(dog5);
        pound1.addDog(dog6);
        pound1.addDog(dog7);
        pound2.addDog(dog6);
        pound2.addDog(dog7);
    }
    
}
