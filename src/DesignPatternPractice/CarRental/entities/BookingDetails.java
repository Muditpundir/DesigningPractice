package DesignPatternPractice.CarRental.entities;

import java.util.ArrayList;
import java.util.List;

public class BookingDetails {
    private List<BookingQuery> bookingDetailsList;
    private BookingQuery bookingQuery;

    public  BookingDetails(){
        this.bookingDetailsList=new ArrayList<>();
    }
    public boolean addBookingDetails(BookingQuery bookingQuery){
        bookingDetailsList.add(bookingQuery);
        return  true;
    }
}
