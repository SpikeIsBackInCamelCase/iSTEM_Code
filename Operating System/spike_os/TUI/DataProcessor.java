package spike_os.TUI;

import spike_os.BACKEND.AllData;

public class DataProcessor {
    protected static void  processData(String[] command, int startingIndex, Object dataSet){
        switch (command[startingIndex-1]) {
            case "average":
                switch (command[startingIndex]) {
                    case "dataset":
                        System.out.println(AllData.findMeanValue(command[startingIndex+1], Integer.parseInt(command[startingIndex+2])));
                        Commands.save = true;
                        break;
                    case "allPoints":
                        Commands.save = true;
                        System.out.println(AllData.findMeanValue(Integer.parseInt(command[startingIndex+1]), Integer.parseInt(command[startingIndex+2])));
                    default:
                        break;
                }
                break;
        
            default:
                break;
        }
    }
}