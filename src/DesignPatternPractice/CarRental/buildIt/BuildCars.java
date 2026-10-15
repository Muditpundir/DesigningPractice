package DesignPatternPractice.CarRental.buildIt;

import DesignPatternPractice.CarRental.enums.CityEnum;

public class BuildCars {

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
    public  BuildCars createSuvs(int cnt){
        this.suv=cnt;
        return this;
    }
    public  BuildCars createSedan(int cnt){
        this.sedan=cnt;
        return  this;
    }
    public  BuildCars createForCity(CityEnum cityEnum){
        this.cityEnum=cityEnum;
        return this;
    }
    public  BuildCars build(){
        return  this;
    }
}
