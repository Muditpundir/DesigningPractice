package com.company;



import DesignPatternPractice.CarRental.BookingController;
import DesignPatternPractice.CarRental.buildIt.CarCreationConfiguration;
import DesignPatternPractice.CarRental.entities.BookingQuery;
import DesignPatternPractice.CarRental.entities.UserDetails;
import DesignPatternPractice.CarRental.enums.CarCategoryEnum;
import DesignPatternPractice.CarRental.enums.CityEnum;
import DesignPatternPractice.CarRental.factory.CarFactory;
import DesignPatternPractice.CarRental.inventory.CarInventory;
import DesignPatternPractice.CarRental.inventory.CentralInventory;
import DesignPatternPractice.CarRental.payment.CardPayment;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CarInventory carInventory=new CarInventory(CityEnum.GURGAON);
        CarFactory factory=new CarFactory();
        CarCreationConfiguration carCreationConfiguration =new CarCreationConfiguration();
        carCreationConfiguration.createForCity(CityEnum.GURGAON).createSedan(1).createSuvs(1).build();
        carInventory.addCar(factory.createCars(carCreationConfiguration));

        CentralInventory centralInventory=new CentralInventory();
        centralInventory.addCarInventoryCity(carInventory);


        UserDetails userDetails=new UserDetails("Mudit","abc@gmail.com");

        LocalDate today=LocalDate.now();
        BookingQuery bookingQuery= new BookingQuery(CityEnum.GURGAON,today.plusDays(1),today.plusDays(3),CarCategoryEnum.SEDAN,userDetails);


        BookingController bookingController =new BookingController(centralInventory);
        bookingController.processBooking(bookingQuery,new CardPayment());
        bookingController.processBooking(bookingQuery,new CardPayment());







    }

    }

