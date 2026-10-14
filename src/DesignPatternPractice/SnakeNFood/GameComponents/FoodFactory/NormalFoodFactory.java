package DesignPatternPractice.SnakeNFood.GameComponents.FoodFactory;

import DesignPatternPractice.SnakeNFood.GameComponents.Food.FoodItem;
import DesignPatternPractice.SnakeNFood.GameComponents.Food.NormalFood;

public class NormalFoodFactory implements  FoodFactory{

    @Override
    public FoodItem createFood(int x,int y,int point) {
        return new NormalFood(x,y,point);

    }
}
