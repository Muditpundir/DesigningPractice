package DesignPatternPractice.ParkingLot;

import DesignPatternPractice.ParkingLot.Parking.ParkingBuilding;
import DesignPatternPractice.ParkingLot.Parking.ParkingFloor;
import DesignPatternPractice.ParkingLot.Parking.ParkingType;

public class Ticket {
    public Integer ticketId;
    public ParkingType parking;
    public ParkingFloor floor;

    public Ticket(Integer ticketId, ParkingType type,ParkingFloor floor){
         this.ticketId=ticketId;
         this.parking=type;
         this.floor=floor;

    }
}
