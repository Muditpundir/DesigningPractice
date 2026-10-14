package DesignPatternPractice.ExpdediaBookingSystem.paymentStrategy;

public class UPI implements Payment {
    @Override
    public boolean processPayment() {
        System.out.println("Received Via UPI");
        return  true;
    }
}
