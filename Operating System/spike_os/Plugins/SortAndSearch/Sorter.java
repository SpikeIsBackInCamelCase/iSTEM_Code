package spike_os.Plugins.SortAndSearch;

public class Sorter{
    public static void main(String[] args){
        String[] stuff=new String[]{
            "three",
            "one",
            "four",
            "two",
            "five"
        };
        int[] nums=new int[]{
            3,
            1,
            4,
            2,
            5
        };
        String[] sorted=new Sorter(stuff, nums).sorted;
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(((String[])sorted)[i]);
        }
    }
    private Thing[] stuff;
    public String[] sorted;
    public Sorter(String[] stuff, int[] sortBy){
        this.stuff=new Thing[stuff.length];
        for(int i=0;i<stuff.length;i++){
            this.stuff[i]=new Thing(stuff[i],sortBy[i]);
        }
        sort(0);
    }

    private void sort(int startIndex){
        int minIndex=startIndex;
        if(startIndex==stuff.length){
            sorted=new String[startIndex];
            for(int i=0;i<startIndex;i++){
                sorted[i]=stuff[i].item;
            }
            return;
        }
        for(int i=startIndex;i<stuff.length;i++){
            if(stuff[i].id<stuff[minIndex].id){
                Thing t=stuff[i];
                stuff[i]=stuff[minIndex];
                stuff[minIndex]=t;
                t=null;
            }
            sort(startIndex+1);
        }
    }
}