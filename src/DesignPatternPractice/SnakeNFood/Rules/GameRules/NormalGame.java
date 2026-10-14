package DesignPatternPractice.SnakeNFood.Rules.GameRules;

import DesignPatternPractice.SnakeNFood.GameComponents.Food.FoodItem;
import DesignPatternPractice.SnakeNFood.GameComponents.Grid;
import DesignPatternPractice.SnakeNFood.GameComponents.Snake;

import java.awt.*;
import java.util.List;

public class NormalGame implements   SnakeNFoodRules{


    @Override
    public boolean checkWin(List<FoodItem> food) {
       return 0==food.size();
    }

    @Override
    public boolean checkWallCollision(Grid grid, Point point) {
        int n=grid.getN(),m=grid.getM();
       return (point.x<0||point.y<0||point.x>=n||point.y>=m);
    }

    @Override
    public boolean checkSelfBite(Snake snake, Point point) {

        return snake.getSnakePos().peekLast().equals(point);
    }

    @Override
    public void eatFoodAndMove(Snake snake,FoodItem food){
        snake.increaseScore(food.getScore());
        snake.addSnakePos(food.getPosition());

    }
    @Override
    public void moveSnake(Snake snake,Point point){
        snake.addSnakePos(point);
        snake.snakePos.pollLast();
    }

}
