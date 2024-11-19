package DogPack;

import XTras.KennelTracker;

public class Dog {
    protected boolean sex;
    protected boolean isAdopted = true;
    protected String name;
    protected byte age;
    public static int dogIndex = (int)Math.pow(-2, 31);

    public Dog(boolean isMale, String name, byte age){
        this.sex = isMale;
        this.name = name;
        this.age = age;
        KennelTracker.addDog(this);
        dogIndex++;
    }

    @Override
    public String toString(){
        return name + ((sex) ? " is male and is " : " is female and is ") + age + "years old.";
    }
}