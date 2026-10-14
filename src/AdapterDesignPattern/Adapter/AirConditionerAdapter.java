package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.ConcreteClasses.AirConditioner;

public class AirConditionerAdapter  implements  SmartDevice{
    AirConditioner conditioner;

   public AirConditionerAdapter(AirConditioner conditioner){
        this.conditioner=conditioner;
    }
    @Override
    public void turnOn() {
     conditioner.connectToBluetooth();
     conditioner.startCooling();
    }

    @Override
    public void turnOff() {
     conditioner.stopCooling();
     conditioner.disconnect();
    }
}
