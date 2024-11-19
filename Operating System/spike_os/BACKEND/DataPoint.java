package spike_os.BACKEND;

import java.util.ArrayList;

public class DataPoint{
    protected Number [] cordinate;
    protected int dimensions;

    public Number getValue(int index){return cordinate[index];}

    public static void setValue(DataPoint of, DataPoint to){
        of = to;
    }

    public DataPoint(Number [] cordinate){
        boolean samePoint = true;
        this.cordinate = cordinate;
        this.dimensions=cordinate.length;
        DataPoint dp;
        if(AllData.dataPoints.containsKey(this.dimensions)){
            for(int x = 0; x < AllData.dataPoints.get(dimensions).size(); x++) {
                dp = AllData.dataPoints.get(dimensions).get(x);
                for(int i = 0; i < this.dimensions; i++){
                    samePoint = samePoint && dp.cordinate[i]==this.cordinate[i];
                }
                if(samePoint){
                    setValue(this, dp);
                    return;
                }
            }
            AllData.dataPoints.get(this.dimensions).add(this);
        } else {
            AllData.dataPoints.put(this.dimensions, new ArrayList<DataPoint>());
            AllData.dataPoints.get(this.dimensions).add(this);
        }
    }
}