package DesignPatternPractice.VendingMachine.VendingState;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;
import DesignPatternPractice.VendingMachine.Service.VendingService;

public class ReadyState extends VendingState {
    public ReadyState(){super(VendingMachineEnum.States.READY);}
    @Override
    public void nextState(VendingService service) {
          service.setVend(new ItemSelected());

    }

}
