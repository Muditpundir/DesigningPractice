package DesignPatternPractice.VendingMachine.Payment;

public class Coinpayment implements  PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Paying through coin");
    }
}
