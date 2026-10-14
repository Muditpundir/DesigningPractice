package BridgeDesignPattern.Shapes;

import BridgeDesignPattern.Render.Render;

public class Square extends  Shape{

    public Square(Render render){
        super(render);
    }
    @Override
    public void draw() {
        render.renderSquare();
    }
}
