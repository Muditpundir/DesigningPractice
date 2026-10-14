package DesignPatternPractice.VendingMachine.Factories.ProductFactory;

import DesignPatternPractice.VendingMachine.Entities.Product.Biscut;
import DesignPatternPractice.VendingMachine.Entities.Product.Products;

public class BiscutFactory implements  ProductFactory{
    @Override
    public Products createProduct(int quantity) {
        return  new Biscut(quantity);
    }
}
