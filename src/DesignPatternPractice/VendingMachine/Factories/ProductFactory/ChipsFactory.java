package DesignPatternPractice.VendingMachine.Factories.ProductFactory;

import DesignPatternPractice.VendingMachine.Entities.Product.Chips;
import DesignPatternPractice.VendingMachine.Entities.Product.Products;

public class ChipsFactory implements  ProductFactory{
    @Override
    public Products createProduct(int quantity) {
        return new Chips(quantity);
    }
}
