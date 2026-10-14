package DecoratorDesignPattern.Base;

import DecoratorDesignPattern.Component.Coffee;

public class SimpleCoffee implements Coffee {

    @Override
    public void getCost() {
        System.out.println(5);
    }

    @Override
    public void getDescription() {
         System.out.println("Simple coffee");
    }
}
