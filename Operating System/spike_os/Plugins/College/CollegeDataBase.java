package spike_os.Plugins.College;

import java.util.List;

import javax.naming.directory.InvalidAttributesException;

import spike_os.BACKEND.AllData;
import spike_os.BACKEND.DataSet;

import java.util.ArrayList;
import java.util.HashMap;

public class CollegeDataBase{
    protected static HashMap<String, College> allSchools = new HashMap<>();
    private static List<String> schoolNames = new ArrayList<>();

        public static void addCollege(College collegeToAdd){
            schoolNames.add(collegeToAdd.name);
            allSchools.put(collegeToAdd.name, collegeToAdd);
        }
    
    public static College getCollege(String nameOfSchool) throws InvalidAttributesException{
        if(schoolNames.contains(nameOfSchool)){
            return allSchools.get(nameOfSchool);
        } else {
            throw new InvalidAttributesException("this school is not in an existing database accessable to this program");
        }
    }

    public static DataSet makeDataFrom(College[] schools, String nameOfDataSet, String purposeOfDataSet){
        DataSet dataSet = new DataSet();
        try {
            dataSet = new DataSet(schools[0].toDataPoint(), nameOfDataSet, purposeOfDataSet);
        } catch (InvalidAttributesException e) {
            System.out.println(e.getMessage() + "\nMAKING OVERRIDE DATASET WITH NAME: \"placeholder\"");
            try {
                dataSet = DataSet.makeOverrideDataSet(schools[0].toDataPoint(), "placeholder", purposeOfDataSet);
            } catch (InvalidAttributesException wompWompException) {
                //!THIS ERROR WILL NEVER THROW
            }
        }
        
        for (int i = 1; i < schools.length; i++){
            AllData.addDataPoint(nameOfDataSet, schools[i].toDataPoint());
        }
        return dataSet;
    }
}