package FlyWeightDesignPattern.IntrinsicClass;

public class TreeType {
    private final String name;
    private final String color;
    private final String textureData; // Heavy 3D mesh/texture data

    public TreeType(String name, String color, String textureData) {
        this.name = name;
        this.color = color;
        this.textureData = textureData;
    }

    // Extrinsic state (x, y) is passed in when needed
    public void draw(int x, int y) {
        System.out.println("  Drawing [" + name + "] at coordinates (" + x + ", " + y + ")");
    }
}
