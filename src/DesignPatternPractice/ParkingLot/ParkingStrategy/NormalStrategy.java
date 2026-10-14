package DesignPatternPractice.ParkingLot.ParkingStrategy;

import DesignPatternPractice.ParkingLot.Parking.ParkingBuilding;
import DesignPatternPractice.ParkingLot.Parking.ParkingFloor;
import DesignPatternPractice.ParkingLot.Parking.ParkingType;
import DesignPatternPractice.ParkingLot.Ticket;
import DesignPatternPractice.ParkingLot.Vehicle.Vehicle;

import java.util.List;

public class NormalStrategy implements  ParkingStratgey{
    int id=0;
    @Override
    public ParkingFloor findParkingFloor(Vehicle vc, ParkingBuilding building) {
        for(ParkingFloor floor:building.floors){
            if(floor.floorDetails.get(vc.getVehicleType()).size()==0)continue;
            return floor;
        }
        return null;
    }

    @Override
    public void freeParkingSpot(Ticket tk, ParkingFloor floor) {
         String parkingType= tk.parking.getParkingType();
         floor.floorDetails.get(parkingType).add(tk.parking);
    }

    public Ticket generateTicket(Vehicle vc, ParkingFloor floor){
        Ticket ticket=null;
            List<ParkingType> parking=floor.floorDetails.get(vc.getVehicleType());
            ticket=new Ticket(id++,parking.get(parking.size()-1),floor);
            parking.remove(parking.size()-1);
        return ticket;
    }
}
