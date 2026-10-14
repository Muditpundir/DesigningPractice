package DesignPatternPractice.flightBookingSystem.entites;

import DesignPatternPractice.flightBookingSystem.enums.CityEnum;

import java.util.HashMap;
import java.util.Map;

public class AirportManagement {

    Map<CityEnum,Airport> airportCityWise;

    public  AirportManagement(){
        airportCityWise=new HashMap<>();
    }
    public  void addAirport(Airport airport){
        airportCityWise.put(airport.getAirportLocation(),airport);
    }
    public  Airport getAirportForLocation(CityEnum cityEnum){
        return airportCityWise.get(cityEnum);
    }
}
