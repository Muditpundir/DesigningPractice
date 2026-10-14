package DesignPatternPractice.flightBookingSystem.service;

import DesignPatternPractice.flightBookingSystem.entites.*;
import DesignPatternPractice.flightBookingSystem.paymentStrategy.Payment;

import java.time.LocalDate;
import java.util.List;

public class BookingSerices {


    public Seat createBooking(BookingQuery query, AirportManagement airportManagement){
          Airport airport=airportManagement.getAirportForLocation(query.source);
          if(airport==null)return null;
          List<Plane> planes=airport.getCompaniesAircraft(query.companyEnum);
          if(planes==null)return null;
          for(Plane plane:planes){
              if(plane.source.equals(query.source)&&plane.destination.equals(query.destination)){
                List<Seat>seats=  plane.getSeatsType(query.seatTypeEnum);
                if(seats==null)return null;
                for(Seat seat:seats){
                    if(seat.tryReserve(query.date))return seat;
                }
              }
          }
          return null;
    }
    public boolean processPayment(Payment payment){
         return   payment.processPayment();
    }
    public boolean releaseSeat(LocalDate date,Seat seat){
       return seat.makeSeatFree(date);

    }
    public  boolean bookSeat(BookingQuery query, AirportManagement am, Payment payment){
        Seat seat = createBooking(query, am);
        if (seat == null) return false;
        if (processPayment(payment)) return true;
        releaseSeat(query.date, seat);
        return false;

    }
}
