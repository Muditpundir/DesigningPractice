package DesignPatternPractice.flightBookingSystem.paymentStrategy;

public class UPi implements  Payment{
    @Override
    public boolean processPayment() {
        System.out.println("UPI Payment Done");
        return true;
    }
}
