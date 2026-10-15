package DesignPatternPractice.CarRental.factory;

import DesignPatternPractice.CarRental.buildIt.BuildCars;
import DesignPatternPractice.CarRental.entities.Car;
import DesignPatternPractice.CarRental.enums.CarCategoryEnum;
import DesignPatternPractice.CarRental.enums.CityEnum;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public List<Car> createCars(BuildCars buildCars){
        List<Car>carList=new ArrayList<>();
        for(int i=0;i<buildCars.getSedan();i++)carList.add(createSedan(buildCars.getCityEnum()));
        for(int i=0;i<buildCars.getSuv();i++)carList.add(createSuv(buildCars.getCityEnum()));
        return carList;

    }
    private Car createSedan(CityEnum city){
        return new Car(CarCategoryEnum.SDEAN,city);
    }
    private  Car createSuv(CityEnum city){
        return new Car(CarCategoryEnum.SUV,city);
    }
}
