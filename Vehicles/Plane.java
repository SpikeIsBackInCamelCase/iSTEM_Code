public class Plane extends Vehicle{
    double[] wingSweep, gearPos, flapPos, airbrakePos;
    boolean[] accesories;/*
    1: movable gear
    2: flap
    3: airbrake
    */
    byte engineCount, wingCount, rudderCount;
    String planeType, wingOrientation;


    public Plane(double speed, String model,String liftType,int engineCount,int rudderCount,int wingCount,String wingOrientation) {
        super(model,speed,liftType+" flying vehicle");
        planeType=liftType;
        this.engineCount=(byte)engineCount;
        this.wingCount=(byte)wingCount;
        this.rudderCount=(byte)rudderCount;
        this.wingOrientation=wingOrientation;
    }

    
}
