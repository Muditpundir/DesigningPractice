package DesignPatternPractice.ExpdediaBookingSystem.factory;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.BookableTypeEnum;
import DesignPatternPractice.ExpdediaBookingSystem.user.BookingDetails;

public class Cab extends  BookableItem{

    public Cab(BookableTypeEnum bookableTypeEnum) {
        super(bookableTypeEnum);
    }

    @Override
    public Double calculatePrice(BookingDetails details) {
        return super.itemPrice.getBookableBasePrice(details.type)* details.dist;
    }

    public double calculatePrice(double dist){
       return super.itemPrice.getBookableBasePrice(super.type)*dist;
    }
}
