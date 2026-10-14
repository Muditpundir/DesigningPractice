package DesignPatternPractice.ExpdediaBookingSystem.factory;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.BookableTypeEnum;

public class CabFactory implements BookableItemFactory{


    @Override
    public BookableItem createBookableItem(BookableTypeEnum typeEnum) {
        return new Cab(typeEnum);
    }
}
