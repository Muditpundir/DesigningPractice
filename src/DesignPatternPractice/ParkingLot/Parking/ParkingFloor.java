package DesignPatternPractice.ParkingLot.Parking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    public  int floor;
    public Map<String,List<ParkingType>> floorDetails;

    public  ParkingFloor(int floor){
         this.floor=floor;
         floorDetails =new HashMap<>();
    }

    public void addParkingTypeToFloor(ParkingTypeEnum type, List<ParkingType>ls){
        floorDetails.put(type.toString(),ls);
    }


}
