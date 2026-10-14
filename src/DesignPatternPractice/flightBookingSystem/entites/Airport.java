package DesignPatternPractice.flightBookingSystem.entites;

import DesignPatternPractice.flightBookingSystem.enums.CityEnum;
import DesignPatternPractice.flightBookingSystem.enums.CompanyEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Airport {

    private CityEnum airportLocation;

    public CityEnum getAirportLocation() {
        return airportLocation;
    }

    public List<Plane> getCompaniesAircraft(CompanyEnum companyEnum) {
        return companiesAircraft.get(companyEnum);
    }

    Map<CompanyEnum, List<Plane>>companiesAircraft;

    public  Airport(CityEnum airportLocation){
        this.airportLocation=airportLocation;
        companiesAircraft=new HashMap<>();
    }

    public void addPlaneToAirport(Plane plane){
          companiesAircraft.computeIfAbsent(plane.getCompany(),k->new ArrayList<>()).add(plane);
    }
}
