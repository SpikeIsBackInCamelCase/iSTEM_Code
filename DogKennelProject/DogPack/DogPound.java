package DogPack;

import XTras.KennelTracker;

public class DogPound {
    private String name;
    private Dog[] dogsInsideKennel = new Dog[5];
    public static int poundIndex = (int)Math.pow(-2, 31);

    public DogPound(String name){
        this.name = name;
        poundIndex++;
    }

    private boolean isDogInThisKennel(Dog dog){
        for (Dog doggie : dogsInsideKennel){
            if (doggie == dog){
                return true;
            }
        }
        return false;
    }

    public void removeDog(Dog dog){
        if (isDogInThisKennel(dog)){
            for (int i = 0; i< dogsInsideKennel.length; i++){
                if (dog == dogsInsideKennel[i]){
                    dogsInsideKennel[i] = new Dog(true, "null", (byte)0);
                    dogsInsideKennel[i] = null;
                }
            }
        }
    }

    public void addDog(Dog dogToAdd){
        dogToAdd.isAdopted = false;
        for (byte i = 0; i < 5; i++){
            if (dogsInsideKennel[i] != null) {
                continue;
            } else {
                dogsInsideKennel[i] = dogToAdd;
                System.out.println("||||||||||||||||||||||||||\n" + this.name + " Adopted " + dogToAdd.name);
                System.out.println(dogToAdd + "\n--------------------------");
                return;
            }
        }
        System.out.println("||||||||||||||||||||||||||\nFailed to add " + dogToAdd.name + " to the kennel. The kennel is full\n--------------------------");
        return;
    }

    public static void adoptDog(Dog adopt){
        
            if(adopt.isAdopted){
            System.out.println( adopt.name + " is adopted already");
            return;
        } for(DogPound pound : KennelTracker.dogPounds){
            adopt.isAdopted = true;
            pound.removeDog(adopt);
        }
        System.out.println("Successfully adopted " + adopt.name);
    }

    public String toPrint(){
        return name;
    }
}
