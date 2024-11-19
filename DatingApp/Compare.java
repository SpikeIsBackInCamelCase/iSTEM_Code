public class Compare {
    private Human x, y;
    private int z;
    private String ageReason, locationReason, single;  //reasoning varaibles allow for reason getting in the nonvoid method, and output via getters
    public Compare (Human x, Human y) {
        this.x = x;
        this.y = y;
    }

    public boolean testAge(){
        z = x.getAge() - y.getAge();
        switch (z) {
            case 1, 0, -1:
                return true;
            default:
                if (x.getAge()>y.getAge()){
                    ageReason = x.getName() + " is too old!";
                } else {
                    ageReason = y.getName() + " is too old!";
                }
                return false;
        }
    }

    public boolean testLocation() {
        if (x.getLocation().equals(y.getLocation())) {
            return true;
        } else {
            locationReason = "They live in different locations!";
            return false;
        }
    }

    public boolean testSingle(){
        if ((!(x.isSingle())) && (!(y.isSingle()))){
            single = "Both "+x.getName()+" and "+y.getName()+" are not single";
        } else if (!(x.isSingle())){
            single = x.getName() + " is not single!";
        } else if (!(y.isSingle())) {
            single = y.getName() + " is not single!";
        }
        return ((x.isSingle()) || (y.isSingle()));
    }



     // Getter for ageReason
     public String getAgeReason() {
        return ageReason;
    }

    // Getter for locationReason
    public String getLocationReason() {
        return locationReason;
    }

    // Getter for single
    public String getSingle() {
        return single;
    }
}
