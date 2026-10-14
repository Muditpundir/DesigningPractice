package DesignPatternPractice.CarRental.Vehicle;

import DesignPatternPractice.CarRental.RentalEnums;
import DesignPatternPractice.CarRental.RentalManagement.RentalStore;

public class VehicleFactory {

    public SUV createSuv(int price, String registerationNumer, RentalStore store){
    return  new SUV(RentalEnums.VehicleType.SUV,price,registerationNumer,store);

    }
    public  Sedan createSedan( int price, String registerationNumer, RentalStore store){
        return  new Sedan(RentalEnums.VehicleType.SEDAN,price,registerationNumer,store);
    }

}
