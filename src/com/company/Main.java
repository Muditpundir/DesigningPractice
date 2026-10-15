package com.company;



import DesignPatternPractice.CarRental.Console;
import DesignPatternPractice.CarRental.buildIt.BuildCars;
import DesignPatternPractice.CarRental.entities.BookingQuery;
import DesignPatternPractice.CarRental.entities.UserDetails;
import DesignPatternPractice.CarRental.enums.CarCategoryEnum;
import DesignPatternPractice.CarRental.enums.CityEnum;
import DesignPatternPractice.CarRental.factory.CarFactory;
import DesignPatternPractice.CarRental.inventory.CarInventory;
import DesignPatternPractice.CarRental.inventory.CentralInventory;
import DesignPatternPractice.CarRental.payment.CardPayment;


import java.time.LocalDate;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CarInventory carInventory=new CarInventory(CityEnum.GURGAON);
        CarFactory factory=new CarFactory();
        BuildCars buildCars=new BuildCars();
        buildCars.createForCity(CityEnum.GURGAON).createSedan(1).createSuvs(1).build();
        carInventory.addCar(factory.createCars(buildCars));

        CentralInventory centralInventory=new CentralInventory();
        centralInventory.addCarInventoryCity(carInventory);


        UserDetails userDetails=new UserDetails("Mudit","abc@gmail.com");

        LocalDate today=LocalDate.now();
        BookingQuery bookingQuery= new BookingQuery(CityEnum.GURGAON,today.plusDays(1),today.plusDays(3),CarCategoryEnum.SDEAN,userDetails);


        Console console=new Console(centralInventory);
        console.processBooking(bookingQuery,new CardPayment());
        console.processBooking(bookingQuery,new CardPayment());







    }

    }

