package DesignPatternPractice.VendingMachine.Entities.Product;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;

public class Chips extends  Products{
    public Chips(int quantity) {
        super(quantity,VendingMachineEnum.Products.CHIPS);
    }
}
