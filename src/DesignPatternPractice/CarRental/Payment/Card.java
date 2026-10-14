package DesignPatternPractice.CarRental.Payment;

public class Card implements  Payment{
    @Override
    public void processPayment(int total) {
        System.out.println("Procsessing payment for rs : "+ total);
    }

}
