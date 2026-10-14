package DesignPatternPractice.SnakeNFood.GameComponents.FoodFactory;

import DesignPatternPractice.SnakeNFood.GameComponents.Food.FoodItem;
import DesignPatternPractice.SnakeNFood.GameComponents.Food.SpecialFood;

public class SpecialFoodFactory implements  FoodFactory{
    @Override
    public FoodItem createFood(int x, int y, int score) {
        return new SpecialFood(x,y,score);
    }
}
