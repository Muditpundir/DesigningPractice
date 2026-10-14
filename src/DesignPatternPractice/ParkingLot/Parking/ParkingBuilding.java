package DesignPatternPractice.ParkingLot.Parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingBuilding {

  public   List<ParkingFloor> floors;

     public  ParkingBuilding(){
         floors=new ArrayList<>();
     }
    public void addParkingFloor(ParkingFloor floor){
        floors.add(floor);
    }
}
