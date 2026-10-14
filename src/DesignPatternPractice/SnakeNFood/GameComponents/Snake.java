package DesignPatternPractice.SnakeNFood.GameComponents;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Snake {
    public Deque<Point>snakePos;

    public Deque<Point> getSnakePos() {
        return snakePos;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    int currentScore;

    public  Snake(){
        this.snakePos=new ArrayDeque<>();
        currentScore=0;
    }
    public void increaseScore(int currentScore){
        this.currentScore+=currentScore;
    }
    public void addSnakePos(Point point){
        this.snakePos.offerFirst(point);
    }
}
