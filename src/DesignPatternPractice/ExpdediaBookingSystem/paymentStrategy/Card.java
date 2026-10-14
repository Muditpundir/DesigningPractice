package DesignPatternPractice.ExpdediaBookingSystem.paymentStrategy;

public class Card implements  Payment{
    @Override
    public boolean processPayment() {
        System.out.println("Received via card");
        return true;
    }
}
