package spike_os.TUI;

import spike_os.BACKEND.AllData;
import spike_os.BACKEND.DataPoint;

public class AllDataClient {
    //!DATA COMMAND PRECESSOR
    public static void processAllDataCommand(String[] command, int startIndex){
        switch (command[startIndex]){
            case "delete":
                switch(command[startIndex+1]){
                    case "dataset":
                        AllData.removeDataSetByName(command[startIndex+2]);
                        System.out.println("removed dataSet: "+command[startIndex+2]+" successfully!");
                        Commands.save = true;
                        return;
                }
            case "add":
                int size = Integer.parseInt(command[startIndex + 3]);
                Number[] number = new Number[size];
                for (int i=0 ;i<size;i++) {
                    number[i] = Integer.parseInt(command[startIndex+4+i]);
                }
                AllData.addDataPoint(command[startIndex+2], new DataPoint(number));
                Commands.save = true;
                return;
            case "grab":
                Commands.saveObject(AllData.getDataSetByName(command[startIndex+1]));
                Commands.save=true;
                return;
        }
    }
}
