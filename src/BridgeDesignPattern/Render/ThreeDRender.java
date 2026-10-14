package BridgeDesignPattern.Render;

public class ThreeDRender implements  Render{
    @Override
    public void renderCircle() {
        System.out.println("Three d render for circle");
    }

    @Override
    public void renderSquare() {
    System.out.println("3D render for square");
    }

    @Override
    public void renderRectangle() {
         System.out.println("3d Render for rectangle");
    }
}
