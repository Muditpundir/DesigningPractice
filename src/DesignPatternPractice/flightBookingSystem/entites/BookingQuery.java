package DesignPatternPractice.flightBookingSystem.entites;


import DesignPatternPractice.flightBookingSystem.enums.CityEnum;
import DesignPatternPractice.flightBookingSystem.enums.CompanyEnum;
import DesignPatternPractice.flightBookingSystem.enums.SeatTypeEnum;

import java.time.LocalDate;
import java.util.Date;

public class BookingQuery {

    public BookingQuery(UserDetails details, CityEnum source, CityEnum destination, LocalDate date, CompanyEnum companyEnum, SeatTypeEnum seatTypeEnum) {
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.companyEnum = companyEnum;
        this.seatTypeEnum = seatTypeEnum;
        this.userDetails=details;
    }

    public CityEnum source;
    public  CityEnum destination;
    public LocalDate date;
    public CompanyEnum companyEnum;
    public SeatTypeEnum seatTypeEnum;
    public  UserDetails userDetails;


}
