package DesignPatternPractice.CarRental.entities;

import DesignPatternPractice.CarRental.enums.CarCategoryEnum;
import DesignPatternPractice.CarRental.enums.CityEnum;

import java.time.LocalDate;
import java.util.*;

public class Car {
    Map<LocalDate, List<LocalDate>>bookingDetails;
    public CarCategoryEnum getCarCategoryEnum() {
        return carCategoryEnum;
    }

    public Integer getBasePricePerKm() {
        return basePricePerKm;
    }

    public CityEnum getCity() {
        return city;
    }

    public Car(CarCategoryEnum carCategoryEnum, CityEnum city) {
        this.carCategoryEnum = carCategoryEnum;
        this.basePricePerKm = basePricePerKm;
        this.city = city;
        bookingDetails=new HashMap<>();
    }

      private CarCategoryEnum carCategoryEnum;
      private Integer basePricePerKm;
      private CityEnum city;

      public synchronized boolean tryReserve(LocalDate start,LocalDate end){
         List<LocalDate>endDates= bookingDetails.get(start);
         if(endDates==null){endDates=new ArrayList<>();}
         for(LocalDate date:endDates){
             if(date.equals(end))return false;
         }
         endDates.add(end);
         bookingDetails.put(start,endDates);
         return true;
      }

}
