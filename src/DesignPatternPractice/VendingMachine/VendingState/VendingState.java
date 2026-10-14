package DesignPatternPractice.VendingMachine.VendingState;

import DesignPatternPractice.VendingMachine.Entities.OrderDetail.Order;
import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;
import DesignPatternPractice.VendingMachine.Payment.PaymentStrategy;
import DesignPatternPractice.VendingMachine.Service.InventoryService;
import DesignPatternPractice.VendingMachine.Service.VendingService;

public abstract class VendingState {
    public  VendingMachineEnum.States state;
    public  VendingState(VendingMachineEnum.States state){this.state=state;}
    public abstract void nextState(VendingService service);

    public boolean selectProduct(VendingMachineEnum.Products products, int quantity, InventoryService service, VendingService vendingService) {
        throw new IllegalStateException("Cannot select product in the current state.");
    }
    public boolean doPayment(PaymentStrategy strategy, VendingService service) {
        throw new IllegalStateException("Cannot process payment in the current state.");
    }
    public boolean dispenseProduct(VendingMachineEnum.Products products, int quantity, InventoryService service, VendingService vendingService) {
        throw new IllegalStateException("Cannot dispense product in the current state.");
    }
    public  void moveToReadyState(VendingService service){
        throw new IllegalStateException("Cannot move to Ready state from the current state.");

    }

}
