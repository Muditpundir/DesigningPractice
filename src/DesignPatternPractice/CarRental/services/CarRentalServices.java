package DesignPatternPractice.CarRental.services;

import DesignPatternPractice.CarRental.entities.BookingQuery;
import DesignPatternPractice.CarRental.entities.Car;
import DesignPatternPractice.CarRental.inventory.CarInventory;
import DesignPatternPractice.CarRental.inventory.CentralInventory;
import DesignPatternPractice.CarRental.payment.Payment;

import java.util.List;

public class CarRentalServices {


    public Car processBooking(BookingQuery query, CentralInventory centralInventory){
        CarInventory carInventory=centralInventory.getCityInventory(query.getCityEnum());
        if(carInventory==null)return null;
        List<Car>cars=carInventory.getCarsByCategory(query.getCarCategory());
        if(cars==null)return  null;
        for(Car car:cars){
               if(car.tryReserve(query.getStartDate(),query.getEndDate()))return car;

        }
        return  null;
    }
    public boolean processPayment(BookingQuery query, Car car, Payment payment){
            if(payment.processPayment()){
                return true;
            }
            //add releasing logic
            return  false;
    }
    public  boolean addBooking(BookingQuery query,Car car){
       return query.addBookingDetails(car);


    }
}
