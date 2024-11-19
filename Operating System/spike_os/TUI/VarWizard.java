package spike_os.TUI;

import java.util.HashMap;

public class VarWizard {
    protected static HashMap<String, Object> normalVariables = new HashMap<>();
    protected static HashMap<String, Number> numberVaribles = new HashMap<>();

    public static void createNormalVariable(String name, Object o){
        normalVariables.put(name, o);
        Commands.save = true;
    }
    public static void createNumberVarible(String name, Number varible){
        numberVaribles.put(name, varible);
        Commands.save = true;
    }
    public static void removeNormalVariable(String name){
        normalVariables.remove(name, normalVariables.get(name));
        Commands.save = true;
    }
    public static void removeNumberVariable(String name){
        numberVaribles.remove(name, numberVaribles.get(name));
        Commands.save = true;
    }
    protected static Object normalVariable(String s){
        try {
            return normalVariables.get(s);
        } catch (NullPointerException e) {
            return e.getMessage();
        }
    }
    protected static Number numberVariable(String s){
        try {
            return numberVaribles.get(s);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
