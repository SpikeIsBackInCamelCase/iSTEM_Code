package spike_os.Plugins.College;

import javax.naming.directory.InvalidAttributesException;

import spike_os.BACKEND.AllData;
import spike_os.BACKEND.DataPoint;
import spike_os.BACKEND.DataSet;

public class CollegeManager {
    public static College grabBestFit(College[] from, int field, double reference){
        try {
            toDataSet(from, "temporary");
        } catch (InvalidAttributesException e) {
            System.out.print(e.getMessage());
            return null;
        }
        return toCollege(AllData.accessDataSet("temporary").grabClosestValue(reference, field));
        
    }

    public static College toCollege(DataPoint from){
        String name = AllColleges.names.get(from.getValue(5).intValue());
        double ochance = from.getValue(2).doubleValue();
        double pchance = from.getValue(4).doubleValue();
        double gpa = from.getValue(3).doubleValue();
        double niche = from.getValue(1).doubleValue();
        short students = from.getValue(0).shortValue();
        return new College(name, ochance, pchance, gpa, niche, students);
    }

    protected static DataSet toDataSet(College[] colleges, String nameOfDataSet) throws InvalidAttributesException{
        DataSet  data = new DataSet(colleges[0].toDataPoint(), nameOfDataSet, "A dataSet of colleges used for analysis");
        for(int i = 1; i < colleges.length; i++){
            AllData.addDataPoint(nameOfDataSet, colleges[i].toDataPoint());
        }
        return data;
    }
}