import vehicletype.Bike;
import vehicletype.Car;
import vehicletype.Truck;
import vehicletype.Vehicle;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1,5));
        parkingLot.addLevel(new Level(2,10));

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