package DesignPatternPractice.ParkingLot.Parking;

public class BikeParking implements  ParkingType{
    public String parkingType;

    public  BikeParking(){
        this.parkingType=ParkingTypeEnum.BIKE.toString();
    }

    @Override
    public String getParkingType() {
        return this.parkingType;
    }
}
