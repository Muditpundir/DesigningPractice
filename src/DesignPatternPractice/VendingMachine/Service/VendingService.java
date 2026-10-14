package DesignPatternPractice.VendingMachine.Service;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;
import DesignPatternPractice.VendingMachine.Payment.PaymentStrategy;
import DesignPatternPractice.VendingMachine.VendingState.*;

public class VendingService {

    public void setVend(VendingState vend) {
        this.vend = vend;
    }

    public VendingState getVend() {
        return vend;
    }

    private VendingState vend;

    public  VendingService(){
        vend =new ReadyState();
    }

    public boolean selectProduct(VendingMachineEnum.Products products,int quantity,InventoryService service){
        try{
            vend.selectProduct(products,quantity,service,this);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        return true;

    }

    public boolean dispenseProduct(VendingMachineEnum.Products products,int quantity,InventoryService service){

         return vend.dispenseProduct(products,quantity,service,this);
    }

    public boolean processPayment(PaymentStrategy strategy){
            return vend.doPayment(strategy,this);

    }
}
