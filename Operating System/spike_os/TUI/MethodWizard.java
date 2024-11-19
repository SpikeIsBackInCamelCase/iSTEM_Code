package spike_os.TUI;

import spike_os.BACKEND.AllData;
import spike_os.BACKEND.DataPoint;
import spike_os.BACKEND.DataSet;

public class MethodWizard {
    public static void processDataSetMethod(String[] command, int startingIndex){
        switch(command[startingIndex-1]){
            case "dataset":
                dataSetsPointEditor(command, startingIndex);
                break;
            case "saveas":
                System.out.print("enter varible name");
                VarWizard.normalVariables.put(command[startingIndex], Commands.getSelectedObject());
        }
    }
    private static void dataSetsPointEditor(String[] command, int startingIndex){
        int length;
        Number[] number;
        switch(command[startingIndex]){
            case "create":
                length = Integer.parseInt(command[startingIndex+1]);
                number = new Number[length];
                for(int i=0 ;i<length; i++){
                    number[i] = Double.parseDouble(command[startingIndex+2+i]);
                }
                try {
                    Commands.saveObject(new DataSet(new DataPoint(number), command[startingIndex+2+length], (command[startingIndex+3+length]!=null)?command[startingIndex+3+length]:null));
                } catch (Exception e) {
                    System.out.println("DataSet creation failed\n"+e.getMessage());
                }
                Commands.save = true;
                return;
            case "add":
            length = Integer.parseInt(command[startingIndex+2]);
            number = new Number[length];
            for(int i=0 ;i<length; i++){
                number[i] = Double.parseDouble(command[startingIndex+2+i]);
            }
            AllData.addDataPoint(command[startingIndex+1], new DataPoint(number));
            Commands.save = true;
            return;
        }
    }
}
