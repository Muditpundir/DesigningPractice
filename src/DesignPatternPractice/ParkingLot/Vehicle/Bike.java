package DesignPatternPractice.ParkingLot.Vehicle;

import DesignPatternPractice.ParkingLot.Parking.ParkingTypeEnum;

public class Bike implements Vehicle {
    String numberPlate;

    public Bike(String numberPlate){
        this.numberPlate=numberPlate;
    }
    @Override
    public String getVehicleType() {
        return ParkingTypeEnum.BIKE.toString();
    }

    @Override
    public String getNumberPlate() {
        return this.numberPlate;
    }
}
