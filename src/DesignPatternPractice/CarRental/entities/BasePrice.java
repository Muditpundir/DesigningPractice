package DesignPatternPractice.CarRental.entities;

import DesignPatternPractice.CarRental.enums.CarCategoryEnum;

import java.util.HashMap;
import java.util.Map;

public class BasePrice {

    private Map<CarCategoryEnum,Double>carCategoryPrices;

    public  BasePrice(){
        this.carCategoryPrices=new HashMap<>();
    }
    public  void setPrice(CarCategoryEnum carCategoryEnum,Double price){
        carCategoryPrices.put(carCategoryEnum,price);
    }
}
