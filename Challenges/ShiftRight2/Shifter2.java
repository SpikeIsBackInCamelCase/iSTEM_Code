package ShiftRight2;

public class Shifter2 {
    public static String[] shiftRight(String[]whatToShift, int amountToShift){
        String[] arraytoReturn = new String[whatToShift.length];
        int numToUse;
        for (int i=0;i<whatToShift.length;i++){
            numToUse = i+amountToShift;
            while(true) {
                if(numToUse>=whatToShift.length){
                    numToUse-=whatToShift.length;
                }else {
                    break;
                }}
            arraytoReturn[numToUse] = whatToShift[i];
        }
        return arraytoReturn;
    }
    
    public static void print(String[] whatToPrint){
        for(String string : whatToPrint){
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        String[] newArray = {"1", "2", "3", "4", "5"};
        print(shiftRight(newArray, 5));
        System.out.println("-------------------------");
        print(shiftRight(newArray, 2));
    }
}
