package DesignPatternPractice.SnakeNFood.GameComponents.Food;

import java.awt.*;

public class SpecialFood implements FoodItem {
    Point pos;
    int score;

    public  SpecialFood(int x,int y,int score){
        this.pos=new Point(x,y);
        this.score=score;
    }

    @Override
    public Point getPosition() {
        return pos;
    }

    @Override
    public int getScore() {
        return score;
    }
}
