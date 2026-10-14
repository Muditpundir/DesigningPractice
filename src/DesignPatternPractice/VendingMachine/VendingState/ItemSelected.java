package DesignPatternPractice.VendingMachine.VendingState;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;
import DesignPatternPractice.VendingMachine.Service.InventoryService;
import DesignPatternPractice.VendingMachine.Service.VendingService;

public class ItemSelected extends   VendingState{
    public ItemSelected(){super(VendingMachineEnum.States.ITEMSELECTED);}
    @Override
    public void nextState(VendingService service) {
     service.setVend(new Payment());
    }

    @Override
    public boolean selectProduct(VendingMachineEnum.Products products, int quantity, InventoryService service, VendingService vendingService) {
        if(service.getproductStock(products)<quantity) {
            System.out.println("Sorry we have Low Stock ");
        }
        else {
            nextState(vendingService);
        }
        return  true;

    }
}
