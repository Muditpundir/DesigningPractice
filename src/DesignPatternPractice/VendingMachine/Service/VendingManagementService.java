package DesignPatternPractice.VendingMachine.Service;

import DesignPatternPractice.InventoryDesign.WareHouse.ProductEnum;
import DesignPatternPractice.VendingMachine.Entities.OrderDetail.Order;
import DesignPatternPractice.VendingMachine.Entities.Product.Products;
import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;
import DesignPatternPractice.VendingMachine.Factories.ProductFactory.ProductFactory;
import DesignPatternPractice.VendingMachine.Payment.PaymentStrategy;

public class VendingManagementService {

    private VendingManagementService(){
        this.inventoryService=new InventoryService();
        this.vendingService=new VendingService();
    }
    private   static class Instance{
        private  final  static  VendingManagementService service=new VendingManagementService();
    }
    public static  VendingManagementService getInstance(){
        return  Instance.service;
    }

    public  InventoryService inventoryService;
    public VendingService vendingService;

     public  void addProductToVendingMachine(Products products){
         inventoryService.addProduct(products );

     }
    public  void selectProduct(Order order){
          vendingService.selectProduct(order.products,order.quantity,inventoryService);
    }
    public  void payForOrder(PaymentStrategy strategy,int total,Order order){
         boolean done=vendingService.processPayment(strategy);
         System.out.println(done);
         if(done)dispenseOrder(order);
    }
    private   void dispenseOrder(Order order){
        boolean val= vendingService.dispenseProduct(order.products,order.quantity,inventoryService);

    }
}
