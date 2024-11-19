public class Arrays {
    public static short[][] heightFootInches = {{5, 7}, {5, 9}, {5, 10}};
    public static double[] heightInches = {67, 69, 70};
    public static Intubble[] wrapper = {new Intubble(5.6879), new Intubble(5.0), new Intubble(.6843), new Intubble(.252), new Intubble(597.5385)};

    public static double sumOf(double[] numberArray){
        double sum = 0;
        for (int i = 0; i < numberArray.length; i++){
            sum += numberArray[i];
        }
        return sum;
    }

    public static void printStuff(){
        for (int i = 0; i < wrapper.length; i++){
            System.out.println(wrapper[i].VF());
        }
    }

    public static String averageOf(double[] numberArray) {
        double sum = sumOf(numberArray);
        double total = sum / numberArray.length;
        byte feet = (byte)(total/12);
        double inches = total%12;
        return (feet + " Feet and " + inches + " inches");

    }
}
