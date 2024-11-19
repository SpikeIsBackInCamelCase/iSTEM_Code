import java.util.ArrayList;
public class Util {
    
    public static Integer[] sort(Integer[] ints){
        ArrayList<Integer> list = new ArrayList();
        Integer smallestInt = (int)Math.pow(2, 31);
        
        for(int i = 0; i < ints.length; i++){
            list.add(ints[i]);
        }
        for(Integer nums : ints){
            if(nums<smallestInt){
                list.remove(nums);
                list.add(nums, 0);
            }
        }
        Integer[] toReturn = new Integer[list.size()];
        for(int i = 0; i < list.size(); i++){
            toReturn[i] = list.get(i);
        }
        return toReturn;
    }

}
