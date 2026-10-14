package DesignPatternPractice.SnakeNFood.GameConsole;

import DesignPatternPractice.SnakeNFood.GameComponents.Food.FoodItem;
import DesignPatternPractice.SnakeNFood.GameComponents.Grid;
import DesignPatternPractice.SnakeNFood.GameComponents.Snake;
import DesignPatternPractice.SnakeNFood.Rules.GameRules.SnakeNFoodRules;
import com.sun.source.tree.SynchronizedTree;

import java.awt.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GameConsole {
   Grid grid;
   Snake snake;
    List<FoodItem>  foodItemList;
   SnakeNFoodRules rules;
   Scanner sc;

      GameConsole(Grid grid, Snake snake, List<FoodItem> foodItemList, SnakeNFoodRules rules){

        this.grid=grid;
        this.snake=snake;
        this.foodItemList=foodItemList;
        this.rules=rules;
        sc=new Scanner(System.in);
    }

    public  void startGame(){

        while(true){
            Point nextMove =getNextMove(takeUserInput());
            boolean a=rules.checkSelfBite(snake,nextMove);
            boolean b=rules.checkWallCollision(grid,nextMove);

            if(a||b){

                System.out.println("Game Over Sir !!!!!");
                System.out.println("Your final score is: ");
                System.out.println(snake.getCurrentScore());
                break;
            }
            FoodItem foodAtNextMove=checkForFood(nextMove);
            if(foodAtNextMove!=null)rules.eatFoodAndMove(snake,foodAtNextMove);
            else rules.moveSnake(snake,nextMove);
            if(rules.checkWin(foodItemList)){
                System.out.println("Yor won Hurray!!!!!");
                System.out.println("Your total score is "+ snake.getCurrentScore());
                System.out.println("Thanks for playing see u next time");
                return;

            }

        }
    }

    public Point takeUserInput(){
        System.out.println("Please enter ur input in WASD form");
        String input = sc.nextLine().toUpperCase();
        char ch=input.charAt(0);
        if(ch=='W')return new Point(-1,0);
        if(ch=='S')return new Point(1,0);
        if(ch=='A')return new Point(0,-1);
        if(ch=='D')return new Point(0,1);
        System.out.println("Invalid move please select again");
       return takeUserInput();
    }
    public  Point getNextMove(Point point){
        Point crr=snake.getSnakePos().peekFirst();
        return new Point(crr.x+point.x,crr.y+point.y);
    }
    public FoodItem checkForFood(Point point){
        Iterator<FoodItem>itemIterator=foodItemList.listIterator();
        while (itemIterator.hasNext()){
            FoodItem item=itemIterator.next();
            if(item.getPosition().equals(point)){
                itemIterator.remove();
                return item;
            }
        }
        return null;
    }
}
