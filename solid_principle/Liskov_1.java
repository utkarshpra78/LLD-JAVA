package solid_principle;

import java.util.ArrayList;
import java.util.List;

public class Liskov_1 {
    public static void main(String[] args) {
      List<Vehicle> vehicleList = new ArrayList<>();
      vehicleList.add(new MotorCycle());
      vehicleList.add(new Car());
      vehicleList.add(new Bicycle());

      for(Vehicle vec:vehicleList){
        // System.out.println(vec.hasEngine());
        System.out.println(vec.getNumberOfWheels());
      }
    }

}

/*
   if class B is a subtype of class A then we should be able to replace object of A with B without breaking the behaviour of the program
 */
 



class Vehicle{

  public int getNumberOfWheels(){
    return 2;
  } 
}

class EngineVehicle extends Vehicle{

  public Boolean hasEngine(){
    return true;
  }
}

class MotorCycle extends EngineVehicle{

}

class Car extends EngineVehicle{
  @Override
  public int getNumberOfWheels(){
    return 4;
  }
}

class Bicycle extends Vehicle{
  public Boolean hasEngine(){
    return null;
  }
}
  
  
  
  
  