package DesignPatternPractice.ExpdediaBookingSystem.Inevntories;

import DesignPatternPractice.ExpdediaBookingSystem.factory.BookableItem;
import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.BookableTypeEnum;
import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.CityEnum;
import DesignPatternPractice.ExpdediaBookingSystem.user.BookingDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityInventory {

   private Map<BookableTypeEnum, List<BookableItem>> itemByType;
   public CityEnum cityEnum;
   public  CityInventory(CityEnum cityEnum){
       itemByType =new HashMap<>();
       this.cityEnum=cityEnum;
   }

   public  void addBookableItem(BookableItem bookableItem){
       itemByType.computeIfAbsent(bookableItem.type, k -> new ArrayList<>()).add(bookableItem);
   }
   public  List<BookableItem> getBookableTypeList(BookingDetails bookingDetails){
       return itemByType.get(bookingDetails.type);
   }


}
