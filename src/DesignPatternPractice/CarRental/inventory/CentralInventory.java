package DesignPatternPractice.CarRental.inventory;

import DesignPatternPractice.CarRental.entities.Car;
import DesignPatternPractice.CarRental.enums.CityEnum;

import java.util.HashMap;
import java.util.Map;

public class CentralInventory {

    Map<CityEnum, CarInventory>cityWiseInventory;

    public  CentralInventory(){
        cityWiseInventory=new HashMap<>();
    }
    public void addCarInventoryCity(CarInventory carInventory){
        cityWiseInventory.put(carInventory.getCityEnum(),carInventory);
    }
    public CarInventory getCityInventory(CityEnum cityEnum){
        return cityWiseInventory.get(cityEnum);
    }
}
