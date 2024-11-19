public class Vehicle{
    protected double maxSpeedKph;
    protected String serialNumber, movementType;
    
    // Constructor
    public Vehicle(String model, double speed, String type){
        this.serialNumber = model;
        maxSpeedKph = speed;
        movementType = type;
    }
}