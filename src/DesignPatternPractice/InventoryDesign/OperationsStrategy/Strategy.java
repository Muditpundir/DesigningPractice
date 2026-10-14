package DesignPatternPractice.InventoryDesign.OperationsStrategy;

import DesignPatternPractice.InventoryDesign.WareHouse.ProductEnum;
import DesignPatternPractice.InventoryDesign.WareHouse.WareHouse;
import DesignPatternPractice.InventoryDesign.WareHouse.WareHouseManagement;

public interface Strategy {
    public void addStock(WareHouseManagement wareHouses, ProductEnum product, int quantity);
    public WareHouse checkSpace(WareHouseManagement wareHouses, ProductEnum product,int quantity);
    public void TransFerStock(ProductEnum product,int quantity,WareHouse source,WareHouse destination);
}
