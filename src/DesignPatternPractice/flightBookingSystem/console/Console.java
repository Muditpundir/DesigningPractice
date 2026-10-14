package DesignPatternPractice.flightBookingSystem.console;


import DesignPatternPractice.flightBookingSystem.entites.AirportManagement;
import DesignPatternPractice.flightBookingSystem.entites.BookingQuery;
import DesignPatternPractice.flightBookingSystem.entites.Seat;

import DesignPatternPractice.flightBookingSystem.paymentStrategy.Payment;
import DesignPatternPractice.flightBookingSystem.service.BookingSerices;

public class Console {

    private BookingSerices serices;
    private AirportManagement airportManagement;
    public  Console(AirportManagement airportManagement){
        this.serices=new BookingSerices();
        this.airportManagement=airportManagement;
    }


    public void createBooking(BookingQuery query, Payment payment){
        boolean pos= serices.bookSeat(query,airportManagement,payment);
        if(pos)System.out.println("Seat booked");
        else System.out.println("Better luck next time");

    }
    public boolean processPayment(Payment payment){
            return serices.processPayment(payment);
    }
}
