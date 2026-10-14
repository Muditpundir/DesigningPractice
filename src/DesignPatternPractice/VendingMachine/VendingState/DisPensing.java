package DesignPatternPractice.VendingMachine.VendingState;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;
import DesignPatternPractice.VendingMachine.Service.InventoryService;
import DesignPatternPractice.VendingMachine.Service.VendingService;

public class DisPensing extends   VendingState{
    public DisPensing(){super(VendingMachineEnum.States.DISPENSE);}
    @Override
    public void nextState(VendingService service) {
       service.setVend(new Maintinance());

    }

    @Override
    public boolean dispenseProduct(VendingMachineEnum.Products products, int quantity, InventoryService service,VendingService vendingService) {

            boolean val= service.reduceProduct(products,quantity);
            nextState(vendingService);
            if(val) {
                System.out.println("Ur order is placed");
                nextState(vendingService);
            }
            return  val;
        }

    }

