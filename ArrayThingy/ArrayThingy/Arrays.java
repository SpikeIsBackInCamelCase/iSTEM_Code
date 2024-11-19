import java.util.ArrayList;
public class Arrays {
    public static void main (String[] args){
        String[] words = {"hello", "goodbye"};
        String[] revords = reverse(words);
        print(words);
        print(revords);
    }

    protected static String[] reverse(String[] objects){
        
        int max = objects.length;
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < max; i++){
            list.add(objects[(max-1)-i]);
        }
        String[] obje = new String[max];
        for(int i = 0; i < max; i++){
            obje[i] = list.get(i);
        }
        return obje;
    }

    protected static void print(String[] objects){
        for(String object : objects){
            System.out.println(object);
        }
    }
}
