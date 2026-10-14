package DesignPatternPractice.flightBookingSystem.factory;

import DesignPatternPractice.flightBookingSystem.entites.Plane;
import DesignPatternPractice.flightBookingSystem.enums.CityEnum;
import DesignPatternPractice.flightBookingSystem.enums.CompanyEnum;

public class PlaneFactory {

    public Plane createAirIndiaPlane(CityEnum source,CityEnum destination,String name){
        return new Plane(source,destination,name, CompanyEnum.AIRINDIA);
    }
    public Plane createVistara(CityEnum source,CityEnum destination,String name){
        return new Plane(source,destination,name, CompanyEnum.VISTARA);
    }
    public Plane createIndigoPlane(CityEnum source,CityEnum destination,String name){
        return new Plane(source,destination,name, CompanyEnum.INDIGO);
    }
}
