package BridgeDesignPattern.Shapes;

import BridgeDesignPattern.Render.Render;

public class Circle extends  Shape{

   public Circle(Render render){
       super(render);
   }
    @Override
    public void draw() {
        render.renderCircle();
    }
}
