package spike_os.Plugins.College;

import spike_os.BACKEND.DataPoint;

public class College {
    protected String name;
    protected double admissionsChanceOverrall, calculatedCollegeChance, avgGPA, nicheGrade;
    protected short studentBodySize;

    public String getName(){
        return name;
    }

    public College(String name, double overrallChance, double personalChance, double avgGPA, double nicheGrade, short students){
        this.name = name;
        AllColleges.names.add(name);
        this.admissionsChanceOverrall = overrallChance;
        this.calculatedCollegeChance = personalChance;
        this.avgGPA = avgGPA;
        this.nicheGrade = nicheGrade;
        this.studentBodySize = students;
        CollegeDataBase.addCollege(this);
    }

    public DataPoint toDataPoint(){
        return new DataPoint(new Number[]{studentBodySize, nicheGrade, admissionsChanceOverrall, avgGPA, calculatedCollegeChance, AllColleges.names.indexOf(this.name)});
    }
}
