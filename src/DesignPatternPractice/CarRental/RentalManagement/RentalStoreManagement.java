package DesignPatternPractice.CarRental.RentalManagement;

import DesignPatternPractice.CarRental.Payment.Payment;
import DesignPatternPractice.CarRental.Registeration.RegisterationDetails;
import DesignPatternPractice.CarRental.RentalEnums;
import DesignPatternPractice.CarRental.Vehicle.Vehicle;

import java.util.*;

public class RentalStoreManagement {

    public  InventoryService inventoryService;
    public  BookingService bookingService;
    private  RentalStoreManagement(){

        inventoryService=new InventoryService();
        bookingService=new BookingService();
    }

    public  static class Initialize{
        private static final RentalStoreManagement instance=new RentalStoreManagement();
    }
    public static  RentalStoreManagement getInstance(){
       return Initialize.instance;
    }
    public  void addRentalStore(RentalStore store){
         inventoryService.addRentalStore(store);
    }
    public  void addVehicleToRentalStore(String storeName, Vehicle vehicle){
        inventoryService.addVehicleToRentalStore(storeName,vehicle);
    }



     public Vehicle checkAvailablity(RentalEnums.VehicleType type,Date startDate,Date endDate){
        return bookingService.checkAvailablity(inventoryService.rentalStoreList,type,startDate,endDate);
     }

     public RegisterationDetails bookit(Vehicle vehicle, Date startDate, Date endDate){
       return bookingService.bookit(vehicle,startDate,endDate);
     }

     public void completedTrip(RegisterationDetails registerationDetails){
      bookingService.completedTrip(registerationDetails);
     }
     public void showAvailableOptions(){
         bookingService.showAvailableOptions(inventoryService.rentalStoreList);
     }
     public void processPayment(Payment strategy,int total){
        strategy.processPayment(total);
     }

}
