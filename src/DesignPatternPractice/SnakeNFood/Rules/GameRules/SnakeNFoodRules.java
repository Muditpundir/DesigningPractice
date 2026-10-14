package DesignPatternPractice.SnakeNFood.Rules.GameRules;

import DesignPatternPractice.SnakeNFood.GameComponents.Food.FoodItem;
import DesignPatternPractice.SnakeNFood.GameComponents.Grid;
import DesignPatternPractice.SnakeNFood.GameComponents.Snake;

import java.awt.*;
import java.util.List;

public interface SnakeNFoodRules {
    public boolean checkWin(List<FoodItem> food);
    public boolean checkWallCollision(Grid grid,Point point);
    public boolean checkSelfBite(Snake snake, Point point);
    public void eatFoodAndMove(Snake snake,FoodItem food);
    public void moveSnake(Snake snake,Point point);
}
