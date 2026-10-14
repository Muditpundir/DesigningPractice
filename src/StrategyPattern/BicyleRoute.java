package StrategyPattern;

public class BicyleRoute implements Route{

    public void findRoute(String A,String B){
        System.out.println("Bicycle Route is from "+ A+ " to "+B);
    }
}
