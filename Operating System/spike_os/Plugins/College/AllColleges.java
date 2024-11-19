package spike_os.Plugins.College;

import java.util.ArrayList;
import java.util.List;

public class AllColleges {
    protected static List <String> names = new ArrayList<>();
    public static College[] polyTechnicSchools = new College[]{
        new College("CalPoly", .30, .20, 4.08, .92, (short)22440),
        new College("Oregon Tech", .91, .98, 3.5, .85, (short)4804),
        new College("Stevens", .50, .60, 3.8, .9, (short)8842)//!Includes grad and undergrad
    };
    public static College[] aeroSpaceColleges = new College[]{
        new College("University of Maryland - College Park", .76, .83, 3.9, .91, (short)10001),
        new College("Florida A&M University - Tallahassee", .81, .91, 3.8, .90, (short)10002),
        new College("Air Force Institute of Technology", .95, .90, 4.11, .94, (short)10003)
    };
    public static College[] liberalArtColleges = new College[] {
        new College("Reed College", .44, .46, 4.0, .95, (short)1500)
    };
    public static College[] reachSchools = new College[]{
        polyTechnicSchools[0]
    };
    public static College[] targetSchools = new College[]{
        liberalArtColleges[0],
        polyTechnicSchools[2]
    };
    public static College[] safetySchools = new College[]{
        polyTechnicSchools[1],
        aeroSpaceColleges[0],
        aeroSpaceColleges[1],
        aeroSpaceColleges[2]
    };
    public static College myTopChoice = polyTechnicSchools[2];
}
