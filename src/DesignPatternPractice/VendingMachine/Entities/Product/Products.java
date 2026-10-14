package DesignPatternPractice.VendingMachine.Entities.Product;

import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;

public abstract class Products {

    public int getQuantity() {
        return quantity;
    }

    public VendingMachineEnum.Products getProduct() {
        return product;
    }

    public  int quantity;
    public VendingMachineEnum.Products product;

    public  Products(int quantity,VendingMachineEnum.Products product){
        this.quantity=quantity;
        this.product=product;
    }
}
