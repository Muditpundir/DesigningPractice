package DesignPatternPractice.ExpdediaBookingSystem.factory;

import DesignPatternPractice.ExpdediaBookingSystem.Enums.bookableType.BookableTypeEnum;

public interface BookableItemFactory {
    public  BookableItem createBookableItem(BookableTypeEnum typeEnum);
}
