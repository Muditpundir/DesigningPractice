package DesignPatternPractice.CarRental.entities;

import DesignPatternPractice.CarRental.enums.CarCategoryEnum;
import DesignPatternPractice.CarRental.enums.CityEnum;
import DesignPatternPractice.InventoryDesign.User.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingQuery {

    public CityEnum getCityEnum() {
        return cityEnum;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public CarCategoryEnum getCarCategory() {
        return carCategory;
    }

    public UserDetails getDetails() {
        return details;
    }

    private  CityEnum cityEnum;
    private  LocalDate startDate;
    private  LocalDate endDate;
    private  CarCategoryEnum carCategory;
    private   List<Car> bookedCars;

    public BookingQuery(CityEnum cityEnum, LocalDate startDate, LocalDate endDate, CarCategoryEnum carCategory, UserDetails details) {
        this.cityEnum = cityEnum;
        this.startDate = startDate;
        this.endDate = endDate;
        this.carCategory = carCategory;
        this.details = details;
        bookedCars=new ArrayList<>();
    }

    private UserDetails details;

    public  UserDetails getUserDetails(){return this.details;}

    public  boolean addBookingDetails(Car car){
        this.bookedCars.add(car);
        return true;
    }


}
