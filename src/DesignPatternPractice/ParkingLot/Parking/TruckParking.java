package DesignPatternPractice.ParkingLot.Parking;

public class TruckParking implements  ParkingType{
    public String parkingType;

    public  TruckParking(){
        this.parkingType=ParkingTypeEnum.TRUCK.toString();
    }
    @Override
    public String getParkingType() {
        return parkingType;
    }
}
