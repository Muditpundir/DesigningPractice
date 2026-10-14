package DesignPatternPractice.SnakeNFood.GameComponents;

public class Grid {
    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    private int n;
    private int m;

    public Grid(int n,int m){this.n=n;this.m=m;}


}
