public class Human {
    private int age;

    private String location, name;

    private boolean single;

    public Human(int age, String location, String name, boolean single) {
        this.age = age;
        this.location = location;
        this.name = name;
        this.single = single;
    }



    public int getAge() {
        return age;
    }

        public boolean isSingle() {
        return single;
    }

        public String getLocation() {
        return location;
    }

        public String getName() {
        return name;
    }
}