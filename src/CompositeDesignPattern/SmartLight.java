package CompositeDesignPattern;

public class SmartLight implements  SmartComponent{

    @Override
    public void turnOn() {
        System.out.println("Turning on the Light");
    }

    @Override
    public void turnOff() {
       System.out.println("Turning off the light");
    }
}
