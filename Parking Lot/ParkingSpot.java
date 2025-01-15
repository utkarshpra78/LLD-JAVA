import vehicletype.Vehicle;
import vehicletype.vehicleType;

public class ParkingSpot {
    private final int spotNumber;
    private vehicleType type;
    private Vehicle parkedVehicle;

    ParkingSpot(int spotNumber,vehicleType type){
        this.spotNumber=spotNumber;
        this.type=type;
    }

    public boolean isAvailable(){
        return parkedVehicle==null;
    }


    public void ParkVehicle(Vehicle vehicle){
        if(isAvailable() && vehicle.getType()==type){
            parkedVehicle=vehicle;
        }else{
            throw new IllegalArgumentException("invalid slot vehicle is already occupied");
        }
    }

    public void unparkVehicle(){
        parkedVehicle=null;
    }

    //getter of each variable
    public int getSpotNumber(){
        return spotNumber;
    }

    public Vehicle getParkedVehicle(){
        return parkedVehicle;
    }

    public vehicleType getType(){
        return type;
    }
}
