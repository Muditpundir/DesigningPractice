package BridgeDesignPattern.Render;

public class VectorRender implements Render{

    @Override
    public void renderCircle() {
        System.out.println("vector Rendering circle");
    }

    @Override
    public void renderSquare() {
      System.out.println("vecvtor Rendering Square");
    }

    @Override
    public void renderRectangle() {
     System.out.println("vetor Rendering Rectangle");
    }
}
