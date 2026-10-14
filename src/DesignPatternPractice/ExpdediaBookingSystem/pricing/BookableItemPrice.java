package DesignPatternPractice.ExpdediaBookingSystem.pricing;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.BookableTypeEnum;

import java.util.HashMap;
import java.util.Map;

public class BookableItemPrice {
    Map<BookableTypeEnum,Double>bookableTypePrice;

   public BookableItemPrice(){
       bookableTypePrice=new HashMap<>();
   }

   public void setBookablePrice(BookableTypeEnum type,double price){
       bookableTypePrice.put(type,price);
   }
   public double getBookableBasePrice(BookableTypeEnum type){
       return bookableTypePrice.getOrDefault(type,0.0);
   }


}
