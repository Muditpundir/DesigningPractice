package BridgeDesignPattern.Shapes;

import BridgeDesignPattern.Render.Render;

public abstract class Shape {
    public Render render;
    Shape(Render render){
        this.render=render;
    }
    public abstract void draw();
}
