package DesignPatternPractice.ExpdediaBookingSystem.service;

import DesignPatternPractice.ExpdediaBookingSystem.factory.BookableItem;
import DesignPatternPractice.ExpdediaBookingSystem.Inevntories.CentralInventory;
import DesignPatternPractice.ExpdediaBookingSystem.Inevntories.CityInventory;
import DesignPatternPractice.ExpdediaBookingSystem.user.BookingDetails;

import java.util.List;

public class InventoryService {

    public boolean isBookableItemAvailable(BookingDetails bookingDetails, CentralInventory centralInventory){
        CityInventory cityInventory=centralInventory.getCityInventory(bookingDetails.cityEnum);
        if(cityInventory==null){
            return  false;
        }
        List<BookableItem>bookableItemList=cityInventory.getBookableTypeList(bookingDetails);
        for(BookableItem bookableItem:bookableItemList){
            if(bookableItem.occupied==false){
                return true;
            }
        }
        return false;
    }
    public  boolean bookIt(BookingDetails bookingDetails, CentralInventory centralInventory){
        CityInventory cityInventory=centralInventory.getCityInventory(bookingDetails.cityEnum);
        List<BookableItem>bookableItemList=cityInventory.getBookableTypeList(bookingDetails);
        for(BookableItem bookableItem:bookableItemList){
            if(bookableItem.tryReserve()){
                 bookableItem.addUserDetailsWhoBooked(bookingDetails);
                return true;
            }
        }
return  false;
    }
}
