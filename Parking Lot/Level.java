import vehicletype.Vehicle;
import vehicletype.vehicleType;

import java.util.ArrayList;

public class Level {
    private final int floor;
    private ArrayList<ParkingSpot> parkingSpots;

    public Level(int floor,int numSpots){
        this.floor=floor;
        parkingSpots=new ArrayList<>();
        double spotsForBikes = 0.50;
        double spotsForCars = 0.40;

        int numBikes=(int)(spotsForBikes*numSpots);
        int numCars=(int)(spotsForCars*numSpots);
        for(int i=1;i<=numBikes;i++){
            parkingSpots.add(new ParkingSpot(i, vehicleType.MOTORCYCLE));
        }

        for(int i=numBikes+1;i<=numBikes+numCars;i++){
            parkingSpots.add(new ParkingSpot(i, vehicleType.CAR));
        }

        for(int i=numBikes+numCars+1;i<=numSpots;i++){
            parkingSpots.add(new ParkingSpot(i, vehicleType.TRUCK));
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot:parkingSpots){
            if(spot.isAvailable() && spot.getType()==vehicle.getType()){
                spot.ParkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle){
        for(ParkingSpot spot:parkingSpots){
            if(!spot.isAvailable() && spot.getType()==vehicle.getType()){
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }

    public void dispalyAvailability(){
        System.out.println("floor-> "+floor+" availability: ");
        for(ParkingSpot spot :parkingSpots){
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable() ? "Available For"  : "Occupied By ")+" "+spot.getType());
        }
    }
}
