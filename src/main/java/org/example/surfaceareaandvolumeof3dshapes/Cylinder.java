package org.example.surfaceareaandvolumeof3dshapes;
import java.util.Random;

public class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    public Cylinder() {
        Random rand = new Random();
        this.radius = 1 + (10 - 1) * rand.nextDouble();
        this.height = 5 + (20 - 5) * rand.nextDouble();
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public String getName() {
        return "Cylinder";
    }
}
