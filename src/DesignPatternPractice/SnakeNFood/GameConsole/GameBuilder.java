package DesignPatternPractice.SnakeNFood.GameConsole;

import DesignPatternPractice.SnakeNFood.GameComponents.Food.FoodItem;
import DesignPatternPractice.SnakeNFood.GameComponents.Food.SpecialFood;
import DesignPatternPractice.SnakeNFood.GameComponents.FoodFactory.FoodFactory;
import DesignPatternPractice.SnakeNFood.GameComponents.FoodFactory.NormalFoodFactory;
import DesignPatternPractice.SnakeNFood.GameComponents.FoodFactory.SpecialFoodFactory;
import DesignPatternPractice.SnakeNFood.GameComponents.Grid;
import DesignPatternPractice.SnakeNFood.GameComponents.Snake;
import DesignPatternPractice.SnakeNFood.Rules.GameRules.NormalGame;
import DesignPatternPractice.SnakeNFood.Rules.GameRules.SnakeNFoodRules;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GameBuilder {
    Grid grid;
    Snake snake;
    List<FoodItem> foodItemList;
    SnakeNFoodRules rules;


    public GameBuilder addGrid(int n,int m) {
        this.grid = new Grid(n,m);
        return this;
    }

    public GameBuilder withSnakeStartingAt(int i,int j) {
        Snake snake=new Snake();
        snake.addSnakePos(new Point(0,0));
        return  this;
    }


    public  GameBuilder createNormalFood(int i,int j,int score){
        foodItemList=new ArrayList<>();
        foodItemList.add(new NormalFoodFactory().createFood(i,j,score));
        return this;
    }
    public  GameBuilder createSpecialFood(int i,int j,int score){
        foodItemList=new ArrayList<>();
        foodItemList.add(new SpecialFoodFactory().createFood(i,j,score));
        return this;
    }

    public GameBuilder setRules(SnakeNFoodRules rules) {
        this.rules = rules;
        return this;
    }
    public  GameConsole build(){
        if (this.grid == null) this.grid = new Grid(10, 10);
        if (this.snake == null) {
            this.snake = new Snake();
            this.snake.addSnakePos(new Point(0, 0));
        }
        if (this.rules == null) this.rules = new NormalGame();

        // Compiles perfectly because package-private constructor is visible to this file
        return new GameConsole(this.grid, this.snake, this.foodItemList, this.rules);

    }




}
