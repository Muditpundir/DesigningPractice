package DesignPatternPractice.CarRental.payment;

public class Upi implements  Payment{
    @Override
    public boolean processPayment() {
        System.out.println("Processing through upi");
        return true;
    }
}
