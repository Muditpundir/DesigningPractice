package DesignPatternPractice.CarRental.Vehicle;

import DesignPatternPractice.CarRental.RentalEnums;
import DesignPatternPractice.CarRental.RentalManagement.RentalStore;

public class SUV extends  Vehicle{

    private  static int SUVMultipler=2;
    public SUV(RentalEnums.VehicleType type, int price, String registerationNumer, RentalStore store){
        super(type,price,registerationNumer,store);
    }
    @Override
    public int calculateFare(int days) {
        return days*SUVMultipler*this.perKmFare;
    }
}
