package DesignPatternPractice.ExpdediaBookingSystem.console;

import DesignPatternPractice.ExpdediaBookingSystem.Inevntories.CentralInventory;
import DesignPatternPractice.ExpdediaBookingSystem.paymentStrategy.Payment;
import DesignPatternPractice.ExpdediaBookingSystem.service.InventoryService;
import DesignPatternPractice.ExpdediaBookingSystem.user.BookingDetails;

public class Console {

    InventoryService inventoryService;
    CentralInventory centralInventory;
   public  Console(CentralInventory centralInventory){
       this.inventoryService=new InventoryService();
       this.centralInventory=centralInventory;
   }
    public void createBooking(BookingDetails details, Payment payment){
             boolean available= inventoryService.isBookableItemAvailable(details,centralInventory);
             if(available){
              boolean paymentDone=   processPayment(payment);
              if(paymentDone) {
                  inventoryService.bookIt(details, centralInventory);
                  informUserforBooking(details);
              }
             }
             else{
                 System.out.println("Sorry we will get back to u");
             }
    }
    public boolean processPayment(Payment payment){
          return  payment.processPayment();
    }

    public void informUserforBooking(BookingDetails bookingDetails){
       System.out.println("Booking done for "+ bookingDetails.userDetails.getName());
    }
}
