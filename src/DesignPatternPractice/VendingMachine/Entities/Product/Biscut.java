package DesignPatternPractice.VendingMachine.Entities.Product;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;

public class Biscut extends  Products{
    public Biscut(int quantity) {
        super(quantity,  VendingMachineEnum.Products.BISCUT);
    }
}
