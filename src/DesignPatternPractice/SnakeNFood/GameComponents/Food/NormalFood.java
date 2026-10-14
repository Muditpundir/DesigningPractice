package DesignPatternPractice.SnakeNFood.GameComponents.Food;

import java.awt.*;

public class NormalFood implements FoodItem {
    Point pos;
    int score;

    public  NormalFood(int r,int cl,int score) {
        this.pos=new Point(r,cl);
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
