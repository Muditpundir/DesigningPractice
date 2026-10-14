package DesignPatternPractice.flightBookingSystem.entites;

import DesignPatternPractice.flightBookingSystem.enums.CityEnum;
import DesignPatternPractice.flightBookingSystem.enums.CompanyEnum;
import DesignPatternPractice.flightBookingSystem.enums.SeatTypeEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Plane {

    public CityEnum source;
    public CityEnum destination;
    public String planeName;

    public CompanyEnum getCompany() {
        return company;
    }

    public List<Seat> getSeatsType(SeatTypeEnum seatTypeEnum) {
        return seatsType.get(seatTypeEnum);
    }

    private CompanyEnum company;
   private Map<SeatTypeEnum, List<Seat>> seatsType;

   public  Plane(CityEnum source,CityEnum destination,String name,CompanyEnum company){
       this.source=source;
       this.destination=destination;
       this.company=company;
       this.planeName=name;
       seatsType=new HashMap<>();
   }
   public  void addSeats(List<Seat>seats){
       for(Seat seat:seats)
       seatsType.computeIfAbsent(seat.getSeatTypeEnum(),k->new ArrayList<>()).add(seat);
   }
}
