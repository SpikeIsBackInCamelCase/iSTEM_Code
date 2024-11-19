package spike_os.Plugins.SortAndSearch;
import java.util.HashMap;

import spike_os.BACKEND.DataPoint;
import spike_os.BACKEND.DataSet;;

public class Identifier {
    protected static HashMap<String, DataSet> dataSets = new HashMap<String, DataSet>();
    protected static HashMap<String, DataPoint> dataPoints = new HashMap<String, DataPoint>();

    public static void addDataSet(String name, DataSet dataSet) {
        dataSets.put(name, dataSet);
    }

    public static void addDataPoint(String name, DataPoint dataPoint) {
        dataPoints.put(name, dataPoint);
    }
}