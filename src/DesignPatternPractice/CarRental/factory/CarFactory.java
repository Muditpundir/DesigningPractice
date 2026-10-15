package DesignPatternPractice.CarRental.factory;

import DesignPatternPractice.CarRental.buildIt.CarCreationConfiguration;
import DesignPatternPractice.CarRental.entities.Car;
import DesignPatternPractice.CarRental.enums.CarCategoryEnum;
import DesignPatternPractice.CarRental.enums.CityEnum;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public List<Car> createCars(CarCreationConfiguration carCreationConfiguration){
        List<Car>carList=new ArrayList<>();
        for(int i = 0; i< carCreationConfiguration.getSedan(); i++)carList.add(createSedan(carCreationConfiguration.getCityEnum()));
        for(int i = 0; i< carCreationConfiguration.getSuv(); i++)carList.add(createSuv(carCreationConfiguration.getCityEnum()));
        return carList;

    }
    private Car createSedan(CityEnum city){
        return new Car(CarCategoryEnum.SEDAN,city);
    }
    private  Car createSuv(CityEnum city){
        return new Car(CarCategoryEnum.SUV,city);
    }
}
