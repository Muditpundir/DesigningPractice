package DesignPatternPractice.ParkingLot.ParkingStrategy;

import DesignPatternPractice.ParkingLot.Parking.ParkingBuilding;
import DesignPatternPractice.ParkingLot.Parking.ParkingFloor;
import DesignPatternPractice.ParkingLot.Ticket;
import DesignPatternPractice.ParkingLot.Vehicle.Vehicle;

public interface ParkingStratgey {

    public ParkingFloor findParkingFloor(Vehicle vc, ParkingBuilding building);
    public void freeParkingSpot(Ticket tk, ParkingFloor floor);
    public Ticket generateTicket(Vehicle vc, ParkingFloor floor);


    }
