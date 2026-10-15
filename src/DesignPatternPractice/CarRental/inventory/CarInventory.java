package DesignPatternPractice.CarRental.inventory;

import DesignPatternPractice.CarRental.entities.Car;
import DesignPatternPractice.CarRental.enums.CarCategoryEnum;
import DesignPatternPractice.CarRental.enums.CityEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInventory {
    public CityEnum getCityEnum() {
        return cityEnum;
    }

    private CityEnum cityEnum;
    Map<CarCategoryEnum, List<Car>>carByCategory;
    public  CarInventory(CityEnum cityEnum){
        this.cityEnum=cityEnum;
        carByCategory=new HashMap<>();
    }

    public  void addCar(List<Car>cars){
        for(Car car:cars){
            carByCategory.computeIfAbsent(car.getCarCategoryEnum(),k->new ArrayList<>()).add(car);
        }
    }
    public  List<Car> getCarsByCategory(CarCategoryEnum carCategoryEnum){
        return  carByCategory.get(carCategoryEnum);
    }
}
