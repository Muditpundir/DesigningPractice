package DesignPatternPractice.ParkingLot.Vehicle;

import DesignPatternPractice.ParkingLot.Parking.ParkingTypeEnum;

public class Truck implements Vehicle {
    String numberPlate;

    public Truck(String numberPlate){
        this.numberPlate=numberPlate;
    }
    @Override
    public String getVehicleType() {
        return ParkingTypeEnum.TRUCK.toString();
    }

    @Override
    public String getNumberPlate() {
        return this.numberPlate;
    }
}
