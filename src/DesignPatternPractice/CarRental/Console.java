package DesignPatternPractice.CarRental;

import DesignPatternPractice.CarRental.entities.BookingQuery;
import DesignPatternPractice.CarRental.entities.Car;
import DesignPatternPractice.CarRental.inventory.CentralInventory;
import DesignPatternPractice.CarRental.payment.Payment;
import DesignPatternPractice.CarRental.services.CarRentalServices;

public class Console {

        private CarRentalServices services;
        private CentralInventory centralInventory;
        public  Console(CentralInventory centralInventory){
            this.services=new CarRentalServices();
            this.centralInventory=centralInventory;
        }

    public void processBooking(BookingQuery bookingQuery, Payment payment){
           Car car=  services.processBooking(bookingQuery,centralInventory);
           if(car==null){System.out.println("Car is not availble right now");}
           else {
             services.processPayment(bookingQuery,car,payment);
             if(services.addBooking(bookingQuery,car)){
                 System.out.println("Booked ur car and added to ur trips");
             }
             else System.out.println("Someting went wrong");
           }
    }
}
