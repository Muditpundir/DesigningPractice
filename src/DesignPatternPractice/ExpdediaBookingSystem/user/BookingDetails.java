package DesignPatternPractice.ExpdediaBookingSystem.user;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.*;

public class BookingDetails {

     public int dist;
     public BookableTypeEnum type;
     public String startDate;
     public  String endDate;
     public String userName;
     public  String mail;
     public  int days;
     public  CityEnum cityEnum;
    public  UserDetails userDetails;
    public  BookingDetails(UserDetails userDetails,CityEnum cityEnum){
        this.userDetails=userDetails;
        this.cityEnum=cityEnum;

    }
     public void createRoomBookingDetails(String startDate, String endDate, RoomEnum roomEnum){
           this.type=roomEnum;
           this.startDate=startDate;
           this.endDate=endDate;
           this.days=2;
     }
     public  void createFlightBookingDetails(FlightEnum flightEnum){
         this.type=flightEnum;
     }
     public void createCabBookingDetails(int dist, CabEnum cabEnum){
           type=cabEnum;
           this.dist=dist;
     }
}
