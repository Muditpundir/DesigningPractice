package DesignPatternPractice.ExpdediaBookingSystem.Inevntories;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.CityEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CentralInventory {


    private Map<CityEnum,CityInventory> cityInventoryMap;

    public  CentralInventory(){
        cityInventoryMap=new HashMap<>();
    }
    public void addCityInventory(CityInventory cityInventory){
        cityInventoryMap.put(cityInventory.cityEnum,cityInventory);
    }
    public  CityInventory getCityInventory(CityEnum cityEnum){
           return cityInventoryMap.get(cityEnum);
    }
}
