package DesignPatternPractice.VendingMachine.Payment;

public class CashPayment implements  PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing payement for cash");
    }
}
