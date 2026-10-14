package DecoratorDesignPattern.Base;

import DecoratorDesignPattern.Component.Coffee;

public class ExpressoCoffee implements Coffee {
    @Override
    public void getCost() {
        System.out.println(2);
    }

    @Override
    public void getDescription() {
     System.out.println("Expresso");
    }
}
