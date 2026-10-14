package DesignPatternPractice.ExpdediaBookingSystem.factory;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.BookableTypeEnum;
import DesignPatternPractice.ExpdediaBookingSystem.pricing.BookableItemPrice;
import DesignPatternPractice.ExpdediaBookingSystem.user.BookingDetails;

public abstract class BookableItem {
    public BookableTypeEnum type;
    public boolean occupied;
    public BookableItemPrice itemPrice;
    public BookingDetails bookingDetails;

    public BookableItem(BookableTypeEnum bookableTypeEnum) {
        this.type = bookableTypeEnum;
        occupied = false;
        itemPrice = new BookableItemPrice();
    }
    public synchronized boolean tryReserve() {
        if (occupied) return false;   // already taken
        occupied = true;              // take it
        return true;                  // you got it
    }

    public abstract Double calculatePrice(BookingDetails details);
    public  void addUserDetailsWhoBooked(BookingDetails bookingDetails){
        this.bookingDetails = bookingDetails;
    }
}
