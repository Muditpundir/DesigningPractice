package FlyWeightDesignPattern.ExtrensicClass;

import FlyWeightDesignPattern.IntrinsicClass.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String textureData) {
        String key = name + "_" + color;

        // Create the heavy object ONCE, then reuse it for every future request
        if (!treeTypes.containsKey(key)) {
            System.out.println("[Factory] Creating NEW heavy Flyweight instance for: " + name);
            treeTypes.put(key, new TreeType(name, color, textureData));
        }

        return treeTypes.get(key);
    }
}
