public class Rectangle {
    private int length, width, area;
    // Constructor to initialize the rectangle object with given dimensions.
    public Rectangle(int l, int w) {
    length = l;
    width = w;
    area = w*l;
    }

    public String compareArea(Rectangle with){
        return (this.getArea()>with.getArea()) ? (this + " is the bigger recangle.") : (with + " is the biggest rectangle.");
    }

    public int getArea() {
        return area;
    }

    public String toString(){
        return "Rectangle with: Length: "+this.length+" Width: "+this.width+". Area: "+this.area;
    }
}