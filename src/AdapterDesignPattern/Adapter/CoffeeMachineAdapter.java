package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.ConcreteClasses.CoffeeMachine;

public class CoffeeMachineAdapter implements  SmartDevice{
    CoffeeMachine machine;

    public CoffeeMachineAdapter(CoffeeMachine machine){
        this.machine=machine;
    }

    @Override
    public void turnOn() {
        machine.connectToWifi();
        machine.startMachine();
    }

    @Override
    public void turnOff() {
        machine.stopMachine();
        machine.disconnectFromWifi();
    }
}
