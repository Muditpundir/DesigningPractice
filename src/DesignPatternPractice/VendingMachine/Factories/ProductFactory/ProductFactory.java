package DesignPatternPractice.VendingMachine.Factories.ProductFactory;

import DesignPatternPractice.VendingMachine.Entities.Product.Products;

public interface ProductFactory {
    public Products createProduct(int quantity);
}
