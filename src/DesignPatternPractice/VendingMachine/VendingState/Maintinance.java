package DesignPatternPractice.VendingMachine.VendingState;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;
import DesignPatternPractice.VendingMachine.Service.VendingService;

public class Maintinance extends   VendingState{
    public Maintinance(){super(VendingMachineEnum.States.MAINTINANCE);}
    @Override
    public void nextState(VendingService service) {
       service.setVend(new ReadyState());
    }
}
