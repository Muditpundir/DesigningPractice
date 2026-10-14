package AdapterDesignPattern.ConcreteClasses;

public class AirConditioner {

    public void connectToBluetooth(){
        System.out.println("Connected To Bluetooth");
    }
    public void startCooling(){
        System.out.println("Starting Cooling");
    }
    public void stopCooling(){
        System.out.println("Stopped Cooling");

    }
    public void disconnect(){
        System.out.println("Disconnected");
    }
}
