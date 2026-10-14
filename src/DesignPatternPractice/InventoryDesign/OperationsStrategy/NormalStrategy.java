package DesignPatternPractice.InventoryDesign.OperationsStrategy;

import DesignPatternPractice.InventoryDesign.WareHouse.ProductEnum;
import DesignPatternPractice.InventoryDesign.WareHouse.WareHouse;
import DesignPatternPractice.InventoryDesign.WareHouse.WareHouseManagement;

public class NormalStrategy implements  Strategy{


    @Override
    public void addStock(WareHouseManagement wareHouses, ProductEnum product,int quantity) {
        WareHouse wareHouse=checkSpace(wareHouses,product,quantity);
        if(wareHouse==null){
            System.out.println("After checking we foundout there is no space left");
        }
        else {
            wareHouse.addProduct(product,quantity);
            System.out.println("Product added to warehhouse "+wareHouse.name);
        }
    }

    @Override
    public WareHouse checkSpace(WareHouseManagement wareHouses,ProductEnum product,int quantity) {

        for(WareHouse wareHouse:wareHouses.wareHouses){
            if(wareHouse.wareHouseCap()>=quantity){
              return wareHouse;
            }
        }
        System.out.println("No space left sorry");
        return  null;
    }

    @Override
    public void TransFerStock(ProductEnum product,int quantity,WareHouse source,WareHouse destination) {
         if(source.getProductStockCount(product)<quantity){
             System.out.println("Quantity is less to move");
             return;
         }
         if(destination.wareHouseCap()<quantity){
             System.out.println("There is less space in warehouse to put aborting");
             return;
         }
         source.reduceProduct(product,quantity);
         destination.addProduct(product,quantity);
    }
}
