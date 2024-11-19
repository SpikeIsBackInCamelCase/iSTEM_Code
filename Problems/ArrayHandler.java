public class ArrayHandler{
    protected Number[] numbers;
    public ArrayHandler(Number[] arr){
        this.numbers = arr;
    }

    public Number[] returnArray(){
        return numbers;
    }

    public void print(){
        boolean first=true;
        System.out.print("\n{");
        for(Number num : numbers){
            if(first) first=false; else  System.out.print(", ");
            System.out.print(num);
        }
        System.out.println("}");
    }

    public void swap(int a, int b){
        Number temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
        temp = null;
    }

    public int findMinimunIndex(int startingIndex){
        double smallestNum = Double.MAX_VALUE;
        int smallestIndex=startingIndex;
        for (int i=startingIndex;i<numbers.length;i++){
            if (numbers[i].doubleValue()<smallestNum) {
                smallestIndex=i;
                smallestNum=numbers[i].doubleValue();
            }
        }
        return smallestIndex;
    }

    public void sort(char type){
        switch (type){
            case 's':
                for (int i=0;i<numbers.length;i++){
                    int minIndex = findMinimunIndex(i);
                    swap(i,minIndex);
                }
            return;
        }
    }
}