package utilities;
public class Pair {
    protected int[][] intArray;
    protected double[] doubleArray;

    protected Pair(int[][] ints, double[] doubles){
        this.intArray = ints;
        this.doubleArray = doubles;
    }

    public int[][] getInt(){
        return intArray;
    }

    public double[] getDouble(){
        return doubleArray;
    }
}
