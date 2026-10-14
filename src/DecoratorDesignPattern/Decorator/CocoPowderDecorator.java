package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Component.Coffee;

public class CocoPowderDecorator extends  BaseDecorator {
    public CocoPowderDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getCost() {
        super.getCost();
        System.out.println(6);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println(" Coco Powder");


    }
}
