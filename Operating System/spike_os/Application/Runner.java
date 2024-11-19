package spike_os.Application;

import java.util.Scanner;

import spike_os.TUI.Commands;

public class Runner {
    static Scanner scanner = new Scanner(System.in);
    //!just a fun little termainal builder project, deffinitely not an OS. has syntax and splits commands, pretty fun and taught me quite a bit
    public static void main(String[] args) {
        String command;
        while(true){
            command = scanner.nextLine();if(command.contains("CLOSENOW"))break;
            try{
                Commands.processCommand(command);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    }
    
}
