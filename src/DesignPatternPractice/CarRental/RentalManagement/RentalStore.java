package DesignPatternPractice.CarRental.RentalManagement;

import DesignPatternPractice.CarRental.Vehicle.Vehicle;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.List;

public class RentalStore {

    public    List<Vehicle>vehicles;

    private   int cap;
    private   String name;
    private StoreLocation location;
    public  RentalStore(int cap,String name,StoreLocation location){
        this.cap=cap;
        this.name=name;
        this.location=location;
        vehicles=new ArrayList<>();
    }
    public int getCap() {
        return cap;
    }

    public String getName() {
        return name;
    }

    public StoreLocation getLocation() {
        return location;
    }





}
