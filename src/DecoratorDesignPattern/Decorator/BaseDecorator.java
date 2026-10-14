package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Component.Coffee;

public class BaseDecorator implements Coffee {

    public Coffee coffee;

    public  BaseDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    @Override
    public void getCost() {
         coffee.getCost();
    }

    @Override
    public void getDescription() {
            coffee.getDescription();
    }
}
