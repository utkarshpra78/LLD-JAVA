import vehicletype.Bike;
import vehicletype.Car;
import vehicletype.Truck;
import vehicletype.Vehicle;

public class ParkingLotMain {
    public static void run(){
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1,100));
        parkingLot.addLevel(new Level(2,120));

        Vehicle car = new Car("car1");
        Vehicle bike = new Bike("bike1");
        Vehicle truck = new Truck("truck1");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(bike);

        parkingLot.displayAvailability();

        parkingLot.unparkVehicle(car);

        parkingLot.displayAvailability();
    }
}
