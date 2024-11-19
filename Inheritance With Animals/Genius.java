public class Genius {
    private int socialIssues;
    private int iq;
    private String college;
    // Constructor
    public Genius(int issues, int intelligence, String almaMatter){
        socialIssues=issues;
        iq=intelligence;
        college=almaMatter;
    }


    public boolean equals(Genius g){return this.socialIssues==g.socialIssues&&this.iq==g.iq&&this.college.equals(g.college);}

    public Genius(Genius g){
        socialIssues=g.socialIssues;
        iq=g.iq;
        college=g.college;
    }
}