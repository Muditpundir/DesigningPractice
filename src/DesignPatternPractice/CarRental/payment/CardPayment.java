package DesignPatternPractice.CarRental.payment;

public class CardPayment implements  Payment{
    @Override
    public boolean processPayment() {
        System.out.println("ProcessedViaCard");
        return true;
    }
}
