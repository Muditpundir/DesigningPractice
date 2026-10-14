package DesignPatternPractice.VendingMachine.Entities.Product;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;

public class ColdDrink extends  Products{
    public ColdDrink(int quantity) {
        super(quantity, VendingMachineEnum.Products.COLDRINK);
    }
}
