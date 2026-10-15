package DesignPatternPractice.CarRental.buildIt;

import DesignPatternPractice.CarRental.enums.CityEnum;

public class CarCreationConfiguration {

    public int getSuv() {
        return suv;
    }

    public int getSedan() {
        return sedan;
    }

    private  int suv;
    private  int sedan;

    public CityEnum getCityEnum() {
        return cityEnum;
    }

    private CityEnum cityEnum;
    public CarCreationConfiguration createSuvs(int cnt){
        this.suv=cnt;
        return this;
    }
    public CarCreationConfiguration createSedan(int cnt){
        this.sedan=cnt;
        return  this;
    }
    public CarCreationConfiguration createForCity(CityEnum cityEnum){
        this.cityEnum=cityEnum;
        return this;
    }
    public CarCreationConfiguration build(){
        return  this;
    }
}
