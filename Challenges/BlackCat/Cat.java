package BlackCat;

public class Cat {
    public String furColor;
    
    public Cat(String furColor){
        this.furColor = furColor;
    }

    protected boolean blackCat(){
        boolean bool = furColor.contains("black");
        return bool;
    }
}
