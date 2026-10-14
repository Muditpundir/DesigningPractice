package CompositeDesignPattern;

public class Airconditioner implements  SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("Turning on AC");
    }

    @Override
    public void turnOff() {
   System.out.println("Turning off the ac");
    }
}
