package DesignPatternPractice.ExpdediaBookingSystem.factory;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.BookableTypeEnum;
import DesignPatternPractice.ExpdediaBookingSystem.user.BookingDetails;

public class Room extends  BookableItem{

    public Room(BookableTypeEnum bookableTypeEnum) {
        super(bookableTypeEnum);
    }
    public Double calculatePrice(BookingDetails details){
        return super.itemPrice.getBookableBasePrice(details.type)*details.days;
    }

}
