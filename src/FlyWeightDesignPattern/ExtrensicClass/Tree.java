package FlyWeightDesignPattern.ExtrensicClass;

import FlyWeightDesignPattern.IntrinsicClass.TreeType;

public class Tree {

    private final int x; // Unique per tree (~4 bytes)
    private final int y; // Unique per tree (~4 bytes)
    private final TreeType type; // Pointer to shared Flyweight object

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y); // Passes unique coordinates to the shared texture
    }
}
