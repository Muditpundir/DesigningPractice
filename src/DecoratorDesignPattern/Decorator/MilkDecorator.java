package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Component.Coffee;

public class MilkDecorator extends BaseDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println(" Milk");
    }

    @Override
    public void getCost() {
        super.getCost();
        System.out.println( 7);
    }
}
