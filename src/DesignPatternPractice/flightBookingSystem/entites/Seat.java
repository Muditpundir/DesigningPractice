package DesignPatternPractice.flightBookingSystem.entites;

import DesignPatternPractice.flightBookingSystem.enums.SeatTypeEnum;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Seat {

    Map<LocalDate,Boolean> seatAvailablity;

    public SeatTypeEnum getSeatTypeEnum() {
        return seatTypeEnum;
    }

    private SeatTypeEnum seatTypeEnum;

    public  Seat(SeatTypeEnum type){
        this.seatTypeEnum =type;
        seatAvailablity=new HashMap<>();
    }

    public synchronized boolean tryReserve(LocalDate date){
          boolean occupied=seatAvailablity.getOrDefault(date,false);
          if(occupied)return false;
          seatAvailablity.put(date,true);
         return true;
    }
    public  synchronized  boolean makeSeatFree(LocalDate date){
        seatAvailablity.put(date,false);
        return  true;
    }

}
