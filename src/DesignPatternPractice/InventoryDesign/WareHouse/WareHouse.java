package DesignPatternPractice.InventoryDesign.WareHouse;

import java.util.HashMap;
import java.util.Map;

public class WareHouse {

    public Map<ProductEnum,Integer>stock;
    int cap;
    public String name;

    public WareHouse(int cap,String name){

        this.cap=cap;
        this.name=name;
        stock=new HashMap<>();
    }



    public int wareHouseCap() {
        return cap;
    }

    public void addProduct(ProductEnum product,int quantity) {
        stock.put(product,stock.getOrDefault(product,0)+quantity);
        updateWareHouseCap(-1*quantity);
    }
    public void reduceProduct(ProductEnum product,int quantity) {
        stock.put(product,stock.getOrDefault(product,0)-quantity);
        updateWareHouseCap(quantity);
    }

    public void updateWareHouseCap(int cap) {
        this.cap+= cap;
    }
    public int getProductStockCount(ProductEnum productEnum){
        return stock.getOrDefault(productEnum,0);
    }



}
