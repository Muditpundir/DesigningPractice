package DesignPatternPractice.ExpdediaBookingSystem.factory;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.BookableTypeEnum;

public class FlightFactory implements  BookableItemFactory{
    @Override
    public BookableItem createBookableItem(BookableTypeEnum typeEnum) {
        return new Flight(typeEnum);
    }
}
