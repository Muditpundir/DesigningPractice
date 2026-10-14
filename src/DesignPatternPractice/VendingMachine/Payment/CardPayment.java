package DesignPatternPractice.VendingMachine.Payment;

public class CardPayment implements  PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Procssing payment for card");
    }
}
