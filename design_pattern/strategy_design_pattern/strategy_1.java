package design_pattern.strategy_design_pattern;

public class strategy_1 {
    public static void main(String[] args) {
        Vechile vechile1 = new OffRoadVehicle();
        vechile1.drive();
        Vechile vechile2 = new GoodsVehicle();
        vechile2.drive();
    }
}

class Vechile{
    DriveStrategy driveObject;

    Vechile(DriveStrategy driveObj){
        this.driveObject=driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
}


interface DriveStrategy{
    public void drive();
}

class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("normal drive capability");
    }
}

class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("sports drive capability");
    }
}

class XYZsDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("XYZ drive capability");
    }
}

class OffRoadVehicle extends Vechile{
    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}

class GoodsVehicle extends Vechile{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}