package DesignPatternPractice.CarRental.RentalManagement;

import DesignPatternPractice.CarRental.Registeration.RegisterationDetails;
import DesignPatternPractice.CarRental.RentalEnums;
import DesignPatternPractice.CarRental.Vehicle.Vehicle;

import java.util.*;

public class BookingService {
    public  List<RegisterationDetails>onGoingRegistration;
    public  BookingService(){
        onGoingRegistration=new ArrayList<>();
    }
    public Vehicle checkAvailablity(List<RentalStore> rentalStoreList, RentalEnums.VehicleType type, Date startDate, Date endDate){
        for(RentalStore store:rentalStoreList){
            for(Vehicle vehicle:store.vehicles){
                if(vehicle.vehicleType.equals(type)) return vehicle;
            }
        }
        System.out.println("No vehicle left of ur choice sorry");
        return null;
    }

    public RegisterationDetails bookit(Vehicle vehicle, Date startDate, Date endDate){
        System.out.println(vehicle.store.getName()+" booking from this store ");
        System.out.println("Booking "+vehicle.vehicleType);
        RegisterationDetails registerationDetails=new RegisterationDetails(startDate,endDate,vehicle);
        vehicle.registerationDetails.add(registerationDetails);
        onGoingRegistration.add(registerationDetails);
        return  registerationDetails;
    }

    public void completedTrip(RegisterationDetails registerationDetails){
        Vehicle vehicle=registerationDetails.vehicle;
        vehicle.store.vehicles.add(vehicle);
        vehicle.registerationDetails.remove(registerationDetails);
        onGoingRegistration.remove(registerationDetails);
    }
    public void showAvailableOptions(List<RentalStore> rentalStoreList){
        Map<RentalEnums.VehicleType,Boolean> mp=new HashMap<>();
        for(RentalStore store:rentalStoreList){
            for(Vehicle vehicle:store.vehicles){
                if(mp.getOrDefault(vehicle.vehicleType,false)!=true){
                    System.out.println(vehicle.vehicleType);
                    mp.put(vehicle.vehicleType,true);
                }
            }
        }
    }
}
