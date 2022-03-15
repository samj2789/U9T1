public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycle kokomisBike = new Bicycle("Sangonomiya Kokomi", 2, 5, "Everlasting Moonglow", 63.0);
    System.out.println(kokomisBike.getName());
    System.out.println(kokomisBike.getWheels());
    System.out.println(kokomisBike.getGearCount());
    System.out.println(kokomisBike.getSeat());
    System.out.println(kokomisBike.getSeatHeight());
    kokomisBike.move(13123);
    kokomisBike.turn(35);
    kokomisBike.brake(0.56);

    //TEST CODE FOR TRAIN
    Train R160 = new Train("Alstom R160A", 4, "MTA", "Third Rail", "Alstom Onix 800 IGBT-VVVF 4lCA 1640 AC Induction Motor", "WABCO RT96", 85200.0, 55.0, 147.5, 1662);
  }
}