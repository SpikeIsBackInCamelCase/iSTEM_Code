public class Rozak extends Genius{
    private String teachesAt;
    private int classesTaught;

    public Rozak(Genius g,String teachesAt, int classes){
        super(g);
        this.teachesAt=teachesAt;
        classesTaught=classes;
    }

    public boolean equals(Rozak r){return ((Genius)this).equals((Genius)r)&&this.teachesAt.equals(r.teachesAt)&&this.classesTaught==r.classesTaught;}
}