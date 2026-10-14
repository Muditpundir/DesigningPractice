package StrategyPattern;

public class RouteFinder {
     Route route;
    public void setRoute(Route route){
        this.route=route;
    }
    public void findRoute(String A,String B){
        route.findRoute(A,B);
    }
}
