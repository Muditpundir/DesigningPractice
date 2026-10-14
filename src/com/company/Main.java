package com.company;



import DesignPatternPractice.flightBookingSystem.console.Console;
import DesignPatternPractice.flightBookingSystem.entites.*;
import DesignPatternPractice.flightBookingSystem.enums.CityEnum;
import DesignPatternPractice.flightBookingSystem.enums.CompanyEnum;
import DesignPatternPractice.flightBookingSystem.enums.SeatTypeEnum;
import DesignPatternPractice.flightBookingSystem.factory.PlaneFactory;
import DesignPatternPractice.flightBookingSystem.factory.SeatFactory;
import DesignPatternPractice.flightBookingSystem.paymentStrategy.Card;


import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PlaneFactory planeFactory=new PlaneFactory();
        Plane airIndia101=planeFactory.createAirIndiaPlane(CityEnum.HYD,CityEnum.GUGAON,"AR101");
        Plane vistara101=planeFactory.createVistara(CityEnum.HYD,CityEnum.GUGAON,"VIS101");


        SeatFactory seatFactory=new SeatFactory();
        List<Seat>vistarSeats= seatFactory.createSeats(1,1,1);
        vistara101.addSeats(vistarSeats);

         airIndia101.addSeats(seatFactory.createSeats(1,1,1));

        Airport airport=new Airport(CityEnum.HYD);
        airport.addPlaneToAirport(vistara101);
        airport.addPlaneToAirport(airIndia101);


        //console and user end
        UserDetails userDetails=new UserDetails("Mudit","abc@gmail.com");
        BookingQuery bookingQuery=new BookingQuery(userDetails,CityEnum.HYD,CityEnum.GUGAON,LocalDate.now(), CompanyEnum.VISTARA, SeatTypeEnum.WINDOW);


        //
        AirportManagement airportManagement=new AirportManagement();
        airportManagement.addAirport(airport);

        Console console=new Console(airportManagement);
        console.createBooking(bookingQuery,new Card());
        console.createBooking(bookingQuery,new Card());











    }

    }

