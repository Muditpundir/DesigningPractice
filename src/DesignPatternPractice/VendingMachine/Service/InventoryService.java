package DesignPatternPractice.VendingMachine.Service;

import DesignPatternPractice.VendingMachine.Entities.Product.Products;
import DesignPatternPractice.VendingMachine.Enums.VendingMachineEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private Map<VendingMachineEnum.Products,Integer>productStock;

    public  InventoryService(){
        productStock=new HashMap<>();
    }
    public void addProduct(Products product){
              productStock.put(product.product,productStock.getOrDefault(product.product,0)+product.quantity);
              System.out.println("ProductAdded");
    }
    public boolean reduceProduct(VendingMachineEnum.Products products,int quantity){
          if(productStock.get(products)<quantity){
              System.out.println("Sorry low stock");
              return  false;
          }
          else {

              productStock.put(products,productStock.get(products)-quantity);
          }
          return  true;
    }
    public int getproductStock(VendingMachineEnum.Products products){
        return  productStock.getOrDefault(products,0);
    }
}
