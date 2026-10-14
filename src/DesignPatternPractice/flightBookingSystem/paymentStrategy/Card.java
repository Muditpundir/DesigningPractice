package DesignPatternPractice.flightBookingSystem.paymentStrategy;

public class Card implements  Payment{
    @Override
    public boolean processPayment() {
        System.out.println("Payment done for card");
        return true;
    }
}
