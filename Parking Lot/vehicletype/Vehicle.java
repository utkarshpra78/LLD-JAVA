package vehicletype;

public abstract class Vehicle {
    protected String numberPlate;
    protected vehicleType type;

    Vehicle(String numberPlate,vehicleType type){
        this.numberPlate=numberPlate;
        this.type=type;
    }

    public vehicleType getType(){
        return type;
    }
}
