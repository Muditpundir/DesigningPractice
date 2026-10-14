package DesignPatternPractice.CarRental.Vehicle;

import DesignPatternPractice.CarRental.Registeration.RegisterationDetails;
import DesignPatternPractice.CarRental.RentalEnums;
import DesignPatternPractice.CarRental.RentalManagement.RentalStore;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    public String registrationNumber;
    public RentalEnums.VehicleType vehicleType;
    public int perKmFare;
    public List<RegisterationDetails> registerationDetails;
    public RentalStore store;

    public Vehicle(RentalEnums.VehicleType type,int perKmFare,String registrationNumber,RentalStore store){
        this.perKmFare=perKmFare;
        this.vehicleType=type;
        this.registrationNumber=registrationNumber;
        this.store=store;
        registerationDetails= new ArrayList<>();
    }

    public void bookit(RegisterationDetails details){
        this.registerationDetails.add(details);
    }

    public  abstract  int calculateFare(int days);
}
