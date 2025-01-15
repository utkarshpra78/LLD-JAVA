import vehicletype.Vehicle;

import java.util.ArrayList;

public class ParkingLot {
    private static ParkingLot instance;
    private final ArrayList<Level> levels;

    private ParkingLot(){
        levels= new ArrayList<>();
    }

    public static ParkingLot getInstance(){
        if(instance==null){
            instance=new ParkingLot();
        }
        return instance;
    }

    public void addLevel(Level level){
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(Level level:levels){
            if(level.parkVehicle(vehicle)){
                System.out.println("vehicle parked successfully");
                return true;
            }
        }
        System.out.println("couldn't park vehicle");
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle){
        for(Level level:levels){
            if(level.unparkVehicle(vehicle)){
                return true;
            }
        }
        return false;
    }

    public void displayAvailability(){
        for(Level level:levels){
            level.dispalyAvailability();
        }
    }

}
