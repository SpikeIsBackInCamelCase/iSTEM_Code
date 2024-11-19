package spike_os.TUI;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Stack;

import javax.naming.directory.InvalidAttributesException;

public class Commands {

    protected static boolean save=false;
    private static Object hand, inv;
    protected static boolean locked = false;
    protected static String[] lock;
    private static Stack<String> commandHistory = new Stack<>(), invalidCommands = new Stack<>();  //To store the history of commands entered by user

    private static void copyActionToClipboard(int index, boolean valid){
        StringSelection s = new StringSelection((valid)?commandHistory.get(commandHistory.size()-index-1):invalidCommands.get(invalidCommands.size()-index-1)); 
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, s);
    }
    //!lets you lock and unlock your terminal
    public static void locker(String [] args, boolean lockT_unlockF){
        if (locked && !lockT_unlockF){
            boolean unlock = true;
            boolean[] lockCheck = new boolean[args.length];
            for (int i = 0; i < args.length; i++){
                try{
                    lockCheck[i] = (args[i].equals(lock[i]));
                } catch (Exception e){
                    System.out.println("Verification failed, incorrect attributes of command");
                    return;
                }
            }
            for (boolean b : lockCheck){
                if (!b){
                    unlock = false;
                }
            }
            if(unlock){
                locked = false;
                System.out.println("unlock  successful.");
            }
        } else if(lockT_unlockF) {
            lock = args;
            locked = true;
            System.out.println("Locked Terminal Successfully.");

        }
    }
    //!MAIN COMMAND PROCESSOR
    public static void processCommand(String command) throws InvalidAttributesException{
        String cmd[] = command.split(". ");
        if(cmd[0].equals("unlock")&&locked){
            locker(cmd[1].split(", "), false);
        }
        switch(cmd[0]){
            case "lock":
                locker(cmd[1].split(", "), true);
                break;
        }
        if (locked){
            throw new InvalidAttributesException("Terminal Locked, enter proper information to unlock");
        }
        switch(cmd[0]){
            case "variable":
                processVarCommand(cmd, 1);
                save=true;
                break;
            case "method":
                processMethodCommand(cmd, 1);
                save=true;
                break;
            case "data":
                switch(cmd[1]){
                    case"all":
                        AllDataClient.processAllDataCommand(cmd, 2);
                        return;
                    case"process":
                        DataProcessor.processData(cmd, 2, hand);
                        return;
                }
                save=true;
                break;
            case "copy"://TODO FIX
                int index;
                boolean valid;
                if(cmd.length!=1){
                    valid=!cmd[1].equals("invalid");
                } else{
                    valid=false;
                }
                if (commandHistory.isEmpty()||invalidCommands.isEmpty()){
                    System.out.println("No previous commands to copy.");
                    return;
                }
                if (!valid&&cmd.length>2) index=-Integer.parseInt(cmd[2]); else if(valid&&cmd.length>1) index=-Integer.parseInt(cmd[1]); else index=0;
                copyActionToClipboard(index, valid);
                if(valid)System.out.println("{"+commandHistory.get(commandHistory.size()-index-1)+"} copied to clipboard."); else System.out.println("{"+invalidCommands.get(invalidCommands.size()-index-1)+"} copied to clipboard.");
                save=true;
                break;
        }
        if(save){
            commandHistory.add(command);
        } else {
            invalidCommands.add(command);
        }
        
    }
    //? Example command => variable-create-number-exampleNum-12.35
    //? makes a varible called exampleNum with a decimal value of 12.35
    public static void processVarCommand(String[] command, int startIndex){
        switch(command[startIndex]){
            case "create":
                switch(command[startIndex+1]){
                    case "number":
                        VarWizard.createNumberVarible(command[startIndex+2], Double.parseDouble(command[startIndex+3]));
                        System.out.println("created number variable with name: "+command[startIndex+2]);
                        return;
                    case "normal":
                        VarWizard.createNormalVariable(command[startIndex+2], hand);
                        System.out.println("created normal variable with name: "+command[startIndex+2]);
                        return;
                }
            case "delete":
            switch(command[startIndex+1]){
                case "number":
                    VarWizard.removeNumberVariable(command[startIndex+2]);
                    System.out.println("removed number variable with name: "+command[startIndex+2]);
                    return;
                case "normal":
                    VarWizard.removeNormalVariable(command[startIndex+2]);
                    System.out.println("removed normal variable with name: "+command[startIndex+2]);
                    return;
            }
            case "hand":
                hand = inv;
                System.out.println("saved object "+hand+" to hand");
                try {
                    if(command[startIndex+1].equals("grab")){
                        switch(command[startIndex + 2]){
                            case "number":
                                inv = VarWizard.numberVariable(command[startIndex + 3]);
                                return;
                            case "normal":
                                inv = VarWizard.normalVariable(command[startIndex + 3]);
                                return;
                        }
                    }
                } catch (Exception e) {
                    inv = null;
                }
                break;
            case "grab":
                switch(command[startIndex + 1]){
                    case "number":
                        inv = VarWizard.numberVariable(command[startIndex + 2]);
                        return;
                    case "normal":
                        inv = VarWizard.normalVariable(command[startIndex + 2]);
                        return;
                }
            case "access":
            switch(command[startIndex + 1]){
                case "number":
                    System.out.println(VarWizard.numberVariable(command[startIndex+2]));
                    return;
                case "normal":
                System.out.println(VarWizard.normalVariable(command[startIndex+2]));
                    return;
            }
        }
    }

    public static void processMethodCommand(String[] command, int startIndex){
        switch(command[startIndex]){
            case  "dataset":
                MethodWizard.processDataSetMethod(command, startIndex+1);
            case "add":
        }
    }

    public static Object getSelectedObject(){
        return hand;
    }

    public static void saveObject(Object o){
        inv = o;
        System.out.println("saved object "+o+" to inventory");
    }
}
