package DesignPatternPractice.SnakeNFood.GameComponents.FoodFactory;

import DesignPatternPractice.SnakeNFood.GameComponents.Food.FoodItem;

public interface FoodFactory {
    public FoodItem createFood(int x,int y,int score);
}
