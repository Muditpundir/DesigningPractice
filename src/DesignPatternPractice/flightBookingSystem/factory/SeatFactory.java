package DesignPatternPractice.flightBookingSystem.factory;

import DesignPatternPractice.flightBookingSystem.entites.Seat;
import DesignPatternPractice.flightBookingSystem.enums.SeatTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class SeatFactory {


    public List<Seat> createSeats(int window,int middle,int asile){
        List<Seat>seatList=new ArrayList<>();
        for(int i=0;i<window;i++)seatList.add(createWindowSeat());
        for(int i=0;i<middle;i++)seatList.add(createMiddleSeat());
        for(int i=0;i<asile;i++)seatList.add(createAsileSeat());
        return seatList;

    }

    private  Seat createWindowSeat(){
        return new Seat(SeatTypeEnum.WINDOW);
    }
    private  Seat createMiddleSeat(){
        return new Seat(SeatTypeEnum.MIDDLE);
    }
    private  Seat createAsileSeat(){
        return new Seat(SeatTypeEnum.ASILE);
    }

}
