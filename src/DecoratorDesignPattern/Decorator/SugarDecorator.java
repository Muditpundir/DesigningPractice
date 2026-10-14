package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Component.Coffee;

public class SugarDecorator  extends  BaseDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getCost() {
        super.getCost();
        System.out.println(9);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Sugar");
    }
}
