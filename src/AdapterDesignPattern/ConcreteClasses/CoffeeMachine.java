package AdapterDesignPattern.ConcreteClasses;

public class CoffeeMachine {
    public void connectToWifi(){
        System.out.println("Connecting to Wifi");
    }

    public void startMachine(){
        System.out.println("Starting machine");
    }
    public void stopMachine(){
        System.out.println("Stop machine");
    }
    public void disconnectFromWifi(){
        System.out.println("Disconnected From wifi");
    }

}
