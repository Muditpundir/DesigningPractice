package DesignPatternPractice.VendingMachine.VendingState;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;
import DesignPatternPractice.VendingMachine.Payment.PaymentStrategy;
import DesignPatternPractice.VendingMachine.Service.InventoryService;
import DesignPatternPractice.VendingMachine.Service.VendingService;

public class Payment extends   VendingState{

    public Payment(){super(VendingMachineEnum.States.PAYMENT);}
    @Override
    public void nextState(VendingService service) {
        service.setVend(new DisPensing());

    }
@Override
    public boolean doPayment(PaymentStrategy strategy,VendingService service) {
        strategy.processPayment();
       nextState(service);
       return  true;
    }
}
