public class PropPlane extends Plane{
    protected double propellorSpeed;
    protected String propType;
    // Constructors
    public PropPlane(double speed, String model,String propOrientation,int engineCount,int rudderCount,int wingCount,String wingOrientation){
        super(speed,model,propOrientation+" propellor",engineCount,rudderCount,wingCount,wingOrientation);
        propType=propOrientation;
    }
}
