package StrategyPattern;

public class WallkRoute implements Route{

    public void findRoute(String A,String B){
        System.out.println("Walk Route is from "+ A+ " to "+B);
    }

}
