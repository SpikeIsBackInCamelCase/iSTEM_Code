package utilities;

public class Inner{
    public static double[][] dubloons = new double[100][100];
    public static void print(double[][] array){
        for(double[] deez : array){
            for(double nutz : deez){
                System.out.print(nutz + ", ");
            }
            System.out.println("\n-----------------------------------");
        }
    }

    public static void print(double[] array){
        System.out.print("\n{");
        for(double num : array){
            System.out.println(num + ", ");
        }
        System.out.println("}");
    }

    public static void print(int[][] array){
        for(int[] nutz : array){
            for(int deez : nutz){
                System.out.print(deez + ", ");
            }
            System.out.println("\n-----------------------------------");
        }
    }

    public static void printRev(double[][] array){
        if (array == null){
            array = dubloons;
        }
        for (int y = array.length-1; y > 0; y--){
            for (int x = array[y].length-1; x > 0; x--){
                System.out.print(array[y][x]);
            }
            System.out.println();
        }
    }

    public static void printRev(Double[] array){
        for(int i = array.length-1; i < 0; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void replaceWithSum(double[][] array){
        double sum = 0.0;
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[y].length; x++){
                if(x == array[y].length-1){
                    dubloons[y][x] = sum;
                } else {
                    sum += array[y][x];
                }
            }
        }
    }

    public static void replaceWithAvg(double[][] array){
        double sum = 0.0;
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[y].length; x++){
                sum += array[y][x];
                if(x == array[y].length-1){
                    dubloons[y][0] = sum/array[y].length;
                }
            }
        }
    }

    public static Pair warpify(double[][] array){
        int maxLength = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i].length > maxLength){
                maxLength = array[i].length;
            }
        }
        int[][] newArray = new int[array.length][maxLength];
        int index = (int)(Math.random()*-1000 + Math.random()*1000);
        int totalSize = 0;
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[y].length; x++){
                newArray[y][x] = (int)array[y][x];
                totalSize++;
            }
        }
        double[] returnable = new double[totalSize];
        totalSize = 0;
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[y].length; x++){
                returnable[totalSize] = array[y][x];
                totalSize++;
            }
        }
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[y].length; x++){
                array[y][x] = index;
                index++;
            }
        }
        return new Pair(newArray, returnable);
    }

    public static void replace(double[][] array, int from, int to){
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[y].length; x++){
                array[y][x] = (from + (Math.random()*(to-from)));
            }
        }
    }

}