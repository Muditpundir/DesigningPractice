package DesignPatternPractice.ParkingLot;

import DesignPatternPractice.ParkingLot.Parking.ParkingBuilding;
import DesignPatternPractice.ParkingLot.Parking.ParkingFloor;
import DesignPatternPractice.ParkingLot.ParkingStrategy.ParkingStratgey;
import DesignPatternPractice.ParkingLot.Vehicle.Vehicle;

public class Console {
    public ParkingBuilding building;
    public ParkingStratgey stratgey;


    public  Console(ParkingBuilding building,ParkingStratgey stratgey){
        this.building=building;
        this.stratgey=stratgey;
    }

    public Ticket parkMyVehicle(Vehicle v){
        Ticket tc=null;
         ParkingFloor floor=stratgey.findParkingFloor(v,building);
         if(floor==null){System.out.println("NO parking space is left for u");}
         else {
             tc=stratgey.generateTicket(v,floor);
            System.out.println("Please park on floor "+ tc.floor.floor+" "+tc.ticketId);

         }
         return tc;
    }
    public void letMeLeave(Ticket ticket){
         stratgey.freeParkingSpot(ticket,ticket.floor);
    }


}
