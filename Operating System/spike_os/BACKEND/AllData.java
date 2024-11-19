package spike_os.BACKEND;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.naming.directory.InvalidAttributesException;
public class AllData {
    protected static HashMap<Integer, List<DataPoint>> dataPoints = new HashMap<>();
    private static HashMap<Integer, List<DataSet>> dataSetsByDimensions = new HashMap<>();
    protected static HashMap<String, DataSet> dataSets = new HashMap<>();
    protected static List<String> dataSetNames = new ArrayList<>();

    public static DataSet getDataSetByName(String name){
        try {
            return dataSets.get(name);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return null; 
        }
    }

    public static void addDataSet(DataSet ds, boolean override) throws InvalidAttributesException{
        if(!dataSetNames.contains(ds.name)){
            dataSetNames.add(ds.name);
            dataSets.put(ds.name, ds);
        } else if(override) {
            dataSets.put(ds.name, ds);
        } else{
            throw  new InvalidAttributesException("A dataset with this name already exists.");
        }
        if(dataSetsByDimensions.containsKey(ds.dimensions)){
            dataSetsByDimensions.get(ds.dimensions).add(ds);
        } else {
            dataSetsByDimensions.put(ds.dimensions, new ArrayList<>());
            dataSetsByDimensions.get(ds.dimensions).add(ds);
        }
    }

    public static DataSet findClosestMeanValue(int totalDimensions, int whichDimension, double valueToFind){
        List<DataSet> list = dataSetsByDimensions.get(totalDimensions);
        double minVal = Double.MAX_VALUE, midValue;
        DataSet minDataSet = new DataSet(), ds;
        double currentVal;
        for (int i = 0; i < list.size(); i++){
            ds = list.get(i);
            midValue = ds.findMeanValue(whichDimension);
            currentVal = Math.abs(midValue-valueToFind);
            minDataSet = (minVal>currentVal)?ds:minDataSet;
        }


        return minDataSet;
    }

    public static void addDataPoint(String dataSetName, DataPoint dataPointToAdd) {
        try {dataSets.get(dataSetName).addDataPoint(dataPointToAdd);} catch(InvalidAttributesException e){
            System.out.print("failed to add " + dataPointToAdd + " to dataset " + dataSets.get(dataSetName));
            return;
        }
    }

    public static DataSet accessDataSet(String dataSetName){
        return  dataSets.get(dataSetName);
    }

    public static double findMeanValue(int dimensions, int axis){
        double sum = 0;
        int size = dataPoints.get(dimensions).size();
        for (DataPoint point : dataPoints.get(dimensions)) {
            sum+=point.cordinate[axis].doubleValue();
        }
        return sum/size;
    }

    public static double findMeanValue(String dataSet, int axis){
        return dataSets.get(dataSet).findMeanValue(axis);
    }

    public static double findAmount(DataSet knownRates){
        return knownRates.approximateArea();
    }

    public static void removeDataSetByName(String name){
        dataSetNames.remove(name);
        dataSets.remove(name);
    }
}