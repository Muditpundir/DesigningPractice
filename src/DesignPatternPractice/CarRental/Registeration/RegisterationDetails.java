package DesignPatternPractice.CarRental.Registeration;

import DesignPatternPractice.CarRental.Vehicle.Vehicle;

import java.util.Date;

public class RegisterationDetails {
    public   Date startDate;
    public   Date endDate;
    public   Vehicle vehicle;

    public  RegisterationDetails(Date startDate,Date endDate,Vehicle vehicle){
        this.endDate=endDate;
        this.startDate=startDate;
        this.vehicle=vehicle;
    }
}
