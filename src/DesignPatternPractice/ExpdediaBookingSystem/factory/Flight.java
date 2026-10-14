package DesignPatternPractice.ExpdediaBookingSystem.factory;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.BookableTypeEnum;
import DesignPatternPractice.ExpdediaBookingSystem.user.BookingDetails;

public class Flight extends  BookableItem{
    public Flight(BookableTypeEnum bookableTypeEnum) {
        super(bookableTypeEnum);
    }

    @Override
    public Double calculatePrice(BookingDetails details) {
        return super.itemPrice.getBookableBasePrice(details.type);
    }

}
