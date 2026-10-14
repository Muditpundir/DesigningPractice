package DesignPatternPractice.VendingMachine.Entities.OrderDetail;

import DesignPatternPractice.InventoryDesign.WareHouse.ProductEnum;
import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;

public class Order {
    public Order(VendingMachineEnum.Products products, int quantity) {
        this.products = products;
        this.quantity = quantity;
    }

    public VendingMachineEnum.Products products;
    public  int quantity;

}
