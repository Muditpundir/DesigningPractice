package DesignPatternPractice.VendingMachine.Factories.ProductFactory;

import DesignPatternPractice.VendingMachine.Entities.Product.ColdDrink;
import DesignPatternPractice.VendingMachine.Entities.Product.Products;

public class ColdDrinkFactory implements  ProductFactory{
    @Override
    public Products createProduct(int quantity) {
        return new ColdDrink(quantity);
    }
}
