package DesignPatternPractice.CarRental.RentalManagement;

import DesignPatternPractice.CarRental.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    public Map<String,RentalStore> isRentalStore;
    public List<RentalStore> rentalStoreList;

    public  InventoryService(){
        this.isRentalStore=new HashMap<>();
        this.rentalStoreList=new ArrayList<>();
    }
    public  void addRentalStore(RentalStore store){
        if(isRentalStore.get(store.getName())==null){
            isRentalStore.put(store.getName(),store);
            rentalStoreList.add(store);
            System.out.println("Added Rental Store");
        }
        else System.out.println("rental Store already Exist");
    }
    public  void addVehicleToRentalStore(String storeName, Vehicle vehicle){
        RentalStore store=isRentalStore.get(storeName);
        if(store.getCap()==store.vehicles.size()){System.out.println("Can't add more vehicle");}
        else { store.vehicles.add(vehicle); System.out.println("Added");}
    }
}
