package DesignPatternPractice.CarRental.Payment;

public class Cash implements Payment{
    @Override
    public void processPayment(int total) {
        System.out.println("Processing Payment for "+ total);
    }
}
